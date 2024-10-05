package com.github.pedrossjr;

public class Calculadora {

    public int somarValores(int a, int b) {
        return a + b;
    }

    public int subtrairValores(int a, int b) {
        return a - b;
    }

    public int multilicarValores(int a, int b) {
        return a * b;
    }

    public int dividirValores(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida");
        }
        return a / b;
    }
}

