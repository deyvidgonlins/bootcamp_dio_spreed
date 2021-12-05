package Exercicios;

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-2, 5, -18, 10, 18, -3};


        System.out.println("Ordem Normal do vetor: ");
        int cont = 0;

        while (cont < (vetor.length)) {
            System.out.print(vetor[cont] + " ");
            cont++;

        }


        System.out.println("\nOrdem Inversa: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nComplementar -- Ordem crescente:\n ");
        int aux;
        for(int i = 0; i < vetor.length; i++){
            for (int j = 0; j < (vetor.length - 1); j++){
                if(vetor[j] > vetor[j + 1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;

                }
            }

        }
        int k = 0;
        while ((k < vetor.length)){
            System.out.print(vetor[k] + " ");
            k++;
        }

    }
}
