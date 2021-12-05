package Exercicios;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        String consoante [] = new String[6];


        Scanner ler = new Scanner(System.in);


        int contador = 0, qtdConsoate =0;
        do{
            System.out.println("Digite uma letra: ");
            String letra = ler.next();
            if( !(letra.equalsIgnoreCase("a") |
                 letra.equalsIgnoreCase("e") |
                 letra.equalsIgnoreCase("i") |
                 letra.equalsIgnoreCase("o") |
                 letra.equalsIgnoreCase("u"))  ) {
                    consoante[contador] = letra;
                    qtdConsoate++;
            }
            contador++;

        }while (contador < consoante.length);
        for (String con: consoante){
            if (con != null)
                System.out.print(con + "");
        }
    }
}
