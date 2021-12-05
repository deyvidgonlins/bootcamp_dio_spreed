package Exercicios;

import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeroAleatorio = new int[20];

        for(int i = 0; i < numeroAleatorio.length; i++){
            int n = random.nextInt(100);
            numeroAleatorio[i] = n;
        }
        System.out.println("Numeros Aleatórios: ");
        for(int num: numeroAleatorio){
            System.out.print(num + " ");
        }

        System.out.println("\nSucessor: ");
        for(int num: numeroAleatorio){
            System.out.print(num+1 + " ");
        }
    }
}
