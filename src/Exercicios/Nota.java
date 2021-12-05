package Exercicios;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float nota;

        System.out.println("Insira um nota valida entre 0 à 10");
        nota = ler.nextFloat();
        while (nota <0 || nota >10){
            System.out.println("Por favor insira um nota valida entre 0 à 10");
            nota = ler.nextFloat();

        }
    }
}
