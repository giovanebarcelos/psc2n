package aula02;

import java.util.Scanner;

/*
Ler notas 1 e 2, fazer a média e verificar se ela é maior
ou igual a 7 (aprovado) ou menor (reprovado).
Author: Gustavo Henrique Herberts Maciel
 */

public class C010 {

    public static void main (String[] args) {

        // Declaração de Variáveis:
        Scanner scanner = new Scanner(System.in);
        float nota1, nota2, media;

        // Leitura de Dados:
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextFloat();

        // Processamento:
        media = (nota1 + nota2) / 2;

        if (media >= 7){
            System.out.print("Aprovado");}
        else {
            System.out.print("Reprovado");}
    }
}