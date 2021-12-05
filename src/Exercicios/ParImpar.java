package Exercicios;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int qtdnum, numero, contPar = 0, contImpar = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantidade de número: ");
        qtdnum = ler.nextInt();

        int cont = 0;
        do {
            System.out.println("Digite um número");
            numero = ler.nextInt();
            if (numero % 2 == 0) {
                ++contPar;
            } else {
                ++contImpar;
            }
            ++cont;

        } while (cont < qtdnum);
        System.out.println("QTD de números Pares:" + contPar);
        System.out.println("QTD de números Impares:" + contPar);

    }
}
