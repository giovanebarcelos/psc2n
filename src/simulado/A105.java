package simulado;

import java.util.Scanner;

/*
A105) (1,5 ptos) Criar uma função/método que verifique se um número é primo.
Faça um programa principal que teste a função desenvolvida. Um número primo
é todo número que é apenas divisível por ele mesmo e o número um. Ex: 7
 */
public class A105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        if (ehPrimo(numero)) System.out.printf("\n\nO número %d é Primo", numero);
        else System.out.printf("\n\nO número %d não é Primo", numero);
    }
    private static boolean ehPrimo(int numero) {
        for (int divisor = 2; divisor < numero; divisor++){
            if (numero % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
