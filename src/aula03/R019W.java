package aula03;
/*
R019 Faça um programa que calcule e mostre a tabuada
de um número digitado pelo usuário.
 */

import java.util.Scanner;

public class R019W {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = scanner.nextInt();

        int multiplicador = 1;

        while ( multiplicador <= 10 ){
            System.out.println(numero + " * " + multiplicador +
                               " = " + numero * multiplicador);
            multiplicador++;
        }
    }
}
