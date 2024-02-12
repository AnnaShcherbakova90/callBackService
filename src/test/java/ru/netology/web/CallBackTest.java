package ru.netology.web;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

class CallbackTest {
    @Test
    void shouldTest() {
        open("http://localhost:9999");
    }
}