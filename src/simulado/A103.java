package simulado;

/*
A103) (1,5 ptos) Escreva um programa que leia um valor inteiro,
calcule e mostre o seu fatorial. Fatorial de um número natural n,
representado por n!, é o produto de todos os inteiros positivos menores ou
iguais a n.
Exemplo: 3! = 6, ou seja, 1 x 2 x 3 = 6.
 */

import java.util.Scanner;

public class A103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número para cálculo do fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int fator = 2; fator <= numero; fator++){
            fatorial *= fator;
        }

        System.out.printf("O fatorial do número %d é %d", numero, fatorial);
    }
}
