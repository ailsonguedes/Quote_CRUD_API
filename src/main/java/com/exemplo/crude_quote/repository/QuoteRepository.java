package com.exemplo.crude_quote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemplo.crude_quote.models.Quote;


public interface QuoteRepository extends JpaRepository<Quote, Long> {

}