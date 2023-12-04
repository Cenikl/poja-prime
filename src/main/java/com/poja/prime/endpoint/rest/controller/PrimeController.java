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
        return BigInteger.probablePrime(10000,new Random());
    }
}
