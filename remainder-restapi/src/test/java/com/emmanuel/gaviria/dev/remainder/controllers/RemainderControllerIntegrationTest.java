package com.emmanuel.gaviria.dev.remainder.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class RemainderControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetMaxK() throws Exception {
        mockMvc.perform(get("/api/maxK")
                        .param("x", "7")
                        .param("y", "5")
                        .param("n", "12345"))
                .andExpect(status().isOk())
                .andExpect(content().string("12339")); // Expected result based on the given problem description
    }

    @Test
    public void testPostMaxK() throws Exception {
        String jsonPayload = "{\"x\":7,\"y\":5,\"n\":12345}";

        mockMvc.perform(post("/api/maxK")
                        .contentType("application/json")
                        .content(jsonPayload))
                .andExpect(status().isOk())
                .andExpect(content().string("12339")); // Expected result based on the given problem description
    }
}
