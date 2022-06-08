package com.example.calculatrice.operation.service;

import com.example.calculatrice.operation.service.impl.OperationServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OperationServiceTest {

    OperationService operationService;

    @BeforeEach
    void setUp() {
        operationService = new OperationServiceImpl();
    }

    @Test
    void addition() {
        assertEquals(4.5f, operationService.addition(1.2f, 3.3f));
    }

    @Test
    void subtraction() {
        assertEquals(-2.1f, operationService.subtraction(1.2f, 3.3f));
    }

    @Test
    void multiplication() {
        assertEquals(3.96f, operationService.multiplication(1.2f, 3.3f));
    }

    @Test
    void division() {
        assertEquals(0.36363637f, operationService.division(1.2f, 3.3f));
    }
}