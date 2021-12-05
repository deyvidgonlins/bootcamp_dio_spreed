package Exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int numero, contador = 1;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe qualquer numero inteiro entre 1 à 10 para ver à tabuada: ");
        numero = ler.nextInt();

        System.out.println("Tabuada de: " + numero);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + numero * i);
        }
    }
}
