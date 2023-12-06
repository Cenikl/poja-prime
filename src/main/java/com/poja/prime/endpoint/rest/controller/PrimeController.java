package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.PojaGenerated;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@PojaGenerated
@RestController
@Value
public class PrimeController {

    List<BigInteger> reviews;
    @GetMapping("/new-prime")
    public BigInteger generatePrime() {
        Random random = new Random();
        BigInteger probablePrime = new BigInteger(1000,15,random);
        return probablePrime;
    }
    @GetMapping("/generated-primes")
    public List<BigInteger> generatePrimes() {
        List<BigInteger> tenPrime = new ArrayList<BigInteger>();
        if(reviews.size() >= 10){
             for (int i = 9; i >= 0; i--) {
                 tenPrime.add(reviews.get(i));
             }
        } else {
            for(int i = reviews.size(); i > 0; i-- ){
                tenPrime.add(reviews.get(i));
            }
        }
        return tenPrime;
    }
}
