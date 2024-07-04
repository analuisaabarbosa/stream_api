package main.functionalInterface;

import java.util.Arrays;
import java.util.List;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um
 * resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar
 * números ou combinar objetos.
 */

public class BinaryOperator {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int resultado = numeros.stream()
            .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println("A soma dos números é: " + resultado);
    }
}
