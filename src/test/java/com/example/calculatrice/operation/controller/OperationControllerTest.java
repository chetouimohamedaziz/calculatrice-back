package com.example.calculatrice.operation.controller;

import com.example.calculatrice.operation.service.OperationService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(OperationController.class)
class OperationControllerTest {

    @Autowired
    MockMvc mockMvc;
    ObjectMapper objectMapper = new ObjectMapper();
    @MockBean
    OperationService operationService;

    @Test
    void addition() throws Exception {
        // when
        ResultActions result = mockMvc.perform(
                get("/operations/addition")
                        .param("a", String.valueOf(1.2f))
                        .param("b", String.valueOf(3.3f))
        );

        // then
        result.andExpect(status().isOk());
    }

    @Test
    void subtraction() throws Exception {
        // when
        ResultActions result = mockMvc.perform(
                get("/operations/subtraction")
                        .param("a", String.valueOf(1.2f))
                        .param("b", String.valueOf(3.3f))
        );

        // then
        result.andExpect(status().isOk());
    }

    @Test
    void multiplication() throws Exception {
        // when
        ResultActions result = mockMvc.perform(
                get("/operations/multiplication")
                        .param("a", String.valueOf(1.2f))
                        .param("b", String.valueOf(3.3f))
        );

        // then
        result.andExpect(status().isOk());
    }

    @Test
    void division() throws Exception {
        // when
        ResultActions result = mockMvc.perform(
                get("/operations/division")
                        .param("a", String.valueOf(1.2f))
                        .param("b", String.valueOf(3.3f))
        );

        // then
        result.andExpect(status().isOk());
    }
}