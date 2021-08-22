package com.practive.springboot.cloud.gateway.custom;

import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.cloud.client.circuitbreaker.ConfigBuilder;

import java.util.function.Function;

public class CustomCircuitBreakerFactory extends CircuitBreakerFactory {

    @Override
    public CircuitBreaker create(String id) {
        return (CircuitBreaker) new CustomCircuitBreakerFactory();
    }

    @Override
    protected ConfigBuilder configBuilder(String id) {
        return null;
    }

    @Override
    public void configureDefault(Function defaultConfiguration) {

    }
}