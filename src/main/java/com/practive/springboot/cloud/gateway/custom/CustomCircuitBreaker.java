package com.practive.springboot.cloud.gateway.custom;

import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;

import java.util.function.Function;
import java.util.function.Supplier;

public class CustomCircuitBreaker implements CircuitBreaker {

    @Override
    public <T> T run(Supplier<T> toRun) {
        return CircuitBreaker.super.run(toRun);
    }

    @Override
    public <T> T run(Supplier<T> toRun, Function<Throwable, T> fallback) {
        return toRun.get();
    }
}
