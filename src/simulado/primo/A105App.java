package simulado.primo;

/*
A105) (1,5 ptos) Criar uma função/método que verifique se um número é primo.
Faça um programa principal que teste a função desenvolvida. Um número primo
é todo número que é apenas divisível por ele mesmo e o número um. Ex: 7
 */

import java.util.Scanner;

public class A105App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo inteiro: ");
        long numero = scanner.nextInt();

        Matematica matematica = new Matematica();

        boolean ehPrimo = matematica.ehPrimo(numero);
        System.out.printf("\n\nNúmero %d %s é primo\n", numero,
                ehPrimo ? "": "não");

        numero = 2000000;
        long somaPrimos = matematica.somaPrimosMenorQue(numero);
        System.out.printf("\nA soma dos primos menores que %d é %d",
                numero, somaPrimos);
    }
}
