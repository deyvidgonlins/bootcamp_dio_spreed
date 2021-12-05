package Exercicios;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Informe o nome:");
            nome = ler.next();

            if(nome.equals("0"))break;

            System.out.println("Informe à idade:");
            idade = ler.nextInt();

        }

    }
}
