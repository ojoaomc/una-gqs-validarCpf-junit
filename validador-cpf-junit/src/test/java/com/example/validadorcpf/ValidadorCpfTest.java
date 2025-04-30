package com.example.validadorcpf;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidadorCpfTest {

    @Test
    public void cpfValidoCom11Digitos() {
        assertTrue(ValidadorCpf.validaTamanhoCpf("12345678901"));
    }

    @Test
    public void cpfComMenosDe11Digitos() {
        assertFalse(ValidadorCpf.validaTamanhoCpf("1234567890"));
    }

    @Test
    public void cpfComMaisDe11Digitos() {
        assertFalse(ValidadorCpf.validaTamanhoCpf("123456789012"));
    }

    @Test
    public void cpfComLetras() {
        assertFalse(ValidadorCpf.validaTamanhoCpf("abc45678901"));
    }

    @Test
    public void cpfNulo() {
        assertFalse(ValidadorCpf.validaTamanhoCpf(null));
    }
}