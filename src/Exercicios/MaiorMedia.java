package Exercicios;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        int verificaMaior = 0;
        int soma =0;

        int count = 0;
        do {
            System.out.println("Informe o Número: ");
            numero = ler.nextInt();
            soma +=numero;
            ++count;

            if (numero > verificaMaior)
                verificaMaior = numero;
        } while (count < 5);
        System.out.println("O número maior é: " +verificaMaior);
        System.out.println("A média é: " +soma/5);
    }

}
