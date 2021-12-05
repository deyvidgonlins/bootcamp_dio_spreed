package Exercicios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int fatorial;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero para saber o fatorial dele:");
        fatorial = ler.nextInt();

        int multiplicao = 1;
        for(int i =fatorial; i>=1; i--){
            multiplicao *= i;
        }
        System.out.println(String.format("Fatorial de %s",fatorial) + "é: " + multiplicao);
    }
}
