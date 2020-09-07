package com.vendingMachine.vendingMachine.controller;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.*;


class HelloWorldTest {


    @Test
    public void shouldReturnHello() {
        HelloWorld helloWorld = new HelloWorld();
        String expected = "hello world";
        String actual = helloWorld.hello();
        assertThat(actual).isEqualTo(expected);
    }
}