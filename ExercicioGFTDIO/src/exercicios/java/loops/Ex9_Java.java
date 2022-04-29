package exercicios.java.loops;

import java.util.Random;

public class Ex9_Java {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }
        System.out.println("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.println("Sucessores de Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero + 1) + " ");
        }
    }

}

