package com.example.calculatrice.operation.service.impl;

import com.example.calculatrice.operation.service.OperationService;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {
    @Override
    public Float addition(Float a, Float b) {
        return a + b;
    }

    @Override
    public Float subtraction(Float a, Float b) {
        return a - b;
    }

    @Override
    public Float multiplication(Float a, Float b) {
        return a * b;
    }

    @Override
    public Float division(Float a, Float b) {
        return a / b;
    }
}
