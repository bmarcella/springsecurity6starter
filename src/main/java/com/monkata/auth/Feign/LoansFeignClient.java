package com.monkata.auth.Feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.monkata.auth.Entity.Loans;

// this interface allow to connect to other service 
@FeignClient("loans")
public interface LoansFeignClient {
	
  @GetMapping(value="getLoanByCustomerId/{id}",  consumes = "application/json")
  List<Loans> getLoansDetails(@PathVariable Long id);
  
}
