package aula02;

import java.util.Scanner;

/*
 C002 Leia um número inteiro e informe se ele é par ou impar
 */
public class C002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.printf("Número: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.printf("\nO número "+numero+" é par\n");
        } else {
            System.out.printf("\nO número "+numero+" é impar\n");
        }

    }
}
