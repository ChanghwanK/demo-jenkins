package com.bloo.jenkins.demojenkinsapp.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @Created by Bloo
 * @Date: 2021/06/05
 */


@WebMvcTest(HomeController.class)
class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @DisplayName ("")
    @Test
    void hello_test () throws Exception {
        // given
        // when
        mockMvc.perform(get("/"))
            .andExpect(content().string("Hello Bloo"))
            .andExpect(status().isOk());
        // then

    }

    @DisplayName ("Jenkins 에 테스트 fail 이 올라가면 어떻게 될")
    @Test
    void hello_test_fail () throws Exception {
        // given
        // when
        mockMvc.perform(get("/"))
            .andExpect(content().string("잘못된 String"))
            .andExpect(status().isOk());
        // then

    }
}