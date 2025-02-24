package aula03;

/*
C007 Faça um algoritmo que leia dois números quaisquer e informe
     se o primeiro é menor, é igual ou maior que o segundo
     número digitado.
 */

import java.util.Scanner;

public class C007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Número 1: ");
        int numero1 = scanner.nextInt();
        System.out.printf("Número 2: ");
        int numero2 = scanner.nextInt();

        if (numero1 < numero2){
            System.out.printf("Primeiro número é menor que o segundo");
        } else if (numero1 == numero2){
            System.out.printf("Primeiro número igual ao segundo");
        } else {
            System.out.printf("O primeiro número é maior que o segundo");
        }
    }
}
