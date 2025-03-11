package aula05;
/*
R019 Faça um programa que calcule e mostre a tabuada
de um número digitado pelo usuário.
 */

import java.util.Scanner;

public class R019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = scanner.nextInt();

        for (int multiplicador = 1;
             multiplicador <= 10; multiplicador++){
            System.out.println(numero + " * " + multiplicador +
                               " = " + numero * multiplicador);
        }
    }
}
