package com.exemplo.crude_quote.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * This class will represent our car and its attributes:
 * - ID
 * - Name
 * - Quote
 * 
 */
@Entity
@Table(name = "quotes")
@EntityListeners(AuditingEntityListener.class)
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Schema(description = "Nome do autor da citação")
    @Column(name = "author", nullable = false)
    private String authorName;

    @Schema(description = "Texto da citação")
    @Column(name = "quote", nullable = false)
    private String quoteText;

    // Constructors

    public Quote(){}

    public Quote(String authorName, String quoteText){
        this.authorName = authorName;
        this.quoteText = quoteText;
    }

    /**
     * Our getters and setters for the attributes above
     */
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getAuthorName(){
        return authorName;
    }

    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }

    public String getQuoteText(){
        return quoteText;
    }

    public void setQuoteText(String quoteText){
        this.quoteText = quoteText;
    }
}



