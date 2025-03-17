package aula07;

/*
M013 Ler um vetor A de 15 números. Após, ler mais um número
e guardar em uma variável X.
Armazenar em um vetor M o resultado de cada elemento de A
multiplicado pelo valor X.
Logo após, imprimir o vetor M.

Author: Vitor André e Rodrigo
 */

import java.util.Scanner;

public class M013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        System.out.println("Digite os 5 elementos do array A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        int numero = 9;

        int[] vetorM = new int[vetorA.length];

        for (int posicao = 0; posicao < vetorA.length; posicao++) {
            vetorM[posicao] = vetorA[posicao] * numero;
            System.out.printf("\n VetorM [%d] = %d", posicao, vetorM[posicao]);
        }
    }
}
