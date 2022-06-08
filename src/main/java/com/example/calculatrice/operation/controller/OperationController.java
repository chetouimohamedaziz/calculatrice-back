package com.example.calculatrice.operation.controller;

import com.example.calculatrice.operation.service.OperationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operations")
public class OperationController {

    final OperationService operationService;

    public OperationController(OperationService operationService) {
        this.operationService = operationService;
    }

    @GetMapping({"/addition"})
    public Float addition(@RequestParam Float a, @RequestParam Float b) {
        return operationService.addition(a, b);
    }

    @GetMapping({"/subtraction"})
    public Float subtraction(@RequestParam Float a, @RequestParam Float b) {
        return operationService.subtraction(a, b);
    }

    @GetMapping({"/multiplication"})
    public Float multiplication(@RequestParam Float a, @RequestParam Float b) {
        return operationService.multiplication(a, b);
    }

    @GetMapping({"/division"})
    public Float division(@RequestParam Float a, @RequestParam Float b) {
        return operationService.division(a, b);
    }
}
