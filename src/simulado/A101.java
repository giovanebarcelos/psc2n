package simulado;

import java.util.Scanner;

/*
A101) (0,5 pontos) Embrulhar um presente de aniversário custa X reais.
O presente de aniversário custa Y reais a mais que o preço para embrulhá-lo.
Quanto custará para comprar e embrulhar o presente?
Faça um programa que responda automaticamente a questão apresentada.
O valor X e Y do problema devem ser lidos e são valores reais.
*/

public class A101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço do Presente: ");
        float presente = scanner.nextFloat();
        System.out.print("Preço para Embrulhar: ");
        float embrulho = scanner.nextFloat();

        float totalPresente = presente + embrulho ;

        System.out.printf("\nValor total do presente é %8.2f",
                totalPresente);
    }
}
