package avaliacao_a1;

/*
A105) (1,5 ptos) Verifique se um número é perfeito.
Um número é perfeito quando a soma de seus divisores próprios
(excluindo ele mesmo) é igual ao próprio número.
Ex: 6 divisores: 1, 2, 3 -> 1 + 2 + 3 = 6 número perfeito
*/

import java.util.Scanner;

public class A105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número inteiro positivo: ");
        int numero = scanner.nextInt();

        int somaDivisores = 0;
        for (int divisor = 1; divisor < numero; divisor++){
            if (numero % divisor == 0){
                somaDivisores += divisor;
            }
        }

        System.out.printf("Número %d%sé perfeito", numero,
                somaDivisores == numero ? " ": " não ");
    }
}
