package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.PojaGenerated;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;
import java.util.Random;

@PojaGenerated
@RestController
@Value
public class PrimeController {
    @GetMapping("/new-prime")
    public BigInteger generatePrime() {
        Random random = new Random();
        double desiredCertainty = Math.ceil(Math.log(1 - 0.9999) / Math.log(2));
        BigInteger probablePrime;
        do {
            probablePrime = new BigInteger(10000,random);
        } while (!probablePrime.isProbablePrime((int) desiredCertainty));
        return probablePrime;
    }
}
