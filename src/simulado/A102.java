package simulado;

/*
A102.  O IAC (Índice de Adiposidade Corporal) é uma fórmula que indica
a condição de peso de um adulto. A fórmula para calcular o IAC é:
Desenvolver um programa que leia a circunferência do quadril (cm),
a altura (m) e o sexo. Calcule o IAC e escreva na tela a condição
que o mesmo encontra-se, conforme a tabela abaixo:
*/

import java.util.Scanner;

public class A102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Circunferência do quadril (cm): ");
        double circunferenciaQuadril = scanner.nextFloat();

        System.out.print("Altura (m): ");
        double altura = scanner.nextFloat();

        System.out.print("Sexo (M/F): ");
        String sexo = scanner.next().toUpperCase();

        double percentualGorduraCorporal = (circunferenciaQuadril /
                ( altura * Math.sqrt(altura))) - 18;

        String condicao = "Obsidade";

        if ("M".equals(sexo)){
            if ( percentualGorduraCorporal < 8 ) {
                condicao = "Abaixo do peso";
            } else if ( percentualGorduraCorporal <= 20) {
                condicao = "Normal";
            } else if ( percentualGorduraCorporal <= 25) {
                condicao = "Sobrepeso";
            }
        } else {
            if ( percentualGorduraCorporal < 20 ) {
                condicao = "Abaixo do peso";
            } else if ( percentualGorduraCorporal <= 32) {
                condicao = "Normal";
            } else if ( percentualGorduraCorporal <= 38) {
                condicao = "Sobrepeso";
            }
        }

        System.out.printf("\n\nA condição é %s", condicao);
    }
}
