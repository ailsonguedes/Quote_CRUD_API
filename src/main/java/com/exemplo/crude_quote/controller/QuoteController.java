package com.exemplo.crude_quote.controller;

import com.exemplo.crude_quote.models.Quote;
import com.exemplo.crude_quote.repository.QuoteRepository;

import io.swagger.v3.oas.annotations.Operation;

import jakarta.validation.Valid;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class QuoteController {

    @Autowired
    private QuoteRepository quoteRepository;

    @Operation(summary = "lista todas as citações", description = "retorna todas as citações listadas no banco")
    @GetMapping("/quotes")
    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    @Operation(summary = "postar uma citação", description = "posta uma citação")
    @PostMapping("/quote")
    public ResponseEntity<Quote>createQuote(@Valid @RequestBody Quote quote){
        Quote savedQuote = quoteRepository.save(quote);
        return ResponseEntity.ok(savedQuote);
    }

    @Operation(summary = "atualizar uma citação", description = "atualiza a citação indicada")
    @PatchMapping("/quote/{id}")
    public ResponseEntity<Quote> updatePartialQuote(
        @PathVariable Long id,
        @Valid @RequestBody Quote quoteDetails) {
            
        return quoteRepository.findById(id)
            .map(quote -> {
                if (quoteDetails.getAuthorName() != null && !quoteDetails.getAuthorName().trim().isEmpty()){
                    quote.setAuthorName(quoteDetails.getAuthorName());
                }
                if (quoteDetails.getQuoteText() != null && !quoteDetails.getQuoteText().trim().isEmpty()){
                    quote.setQuoteText(quoteDetails.getQuoteText());
                }
                Quote updateQuote = quoteRepository.save(quote);
                return ResponseEntity.ok(updateQuote);
            })
            .orElseGet(() -> ResponseEntity.notFound().build());
        }
    @Operation(summary = "Deleta uma citação", description = "Deleta uma citação específica")
    @DeleteMapping("/quote/{id}")
    public ResponseEntity<Void> deleteQuote(@PathVariable Long id) {
        return quoteRepository.findById(id)
            .map(quote -> {
                quoteRepository.delete(quote);
                ResponseEntity<Void> response = ResponseEntity.noContent().build();
                return response;
            })
            .orElseGet(() -> ResponseEntity.notFound().build());
        }
}
