package aula02;
/*
C022 Dados 3 valores referentes aos lados de um triângulo
determinar se é EQUILÁTERO (todos os lados são iguais),
ISÓSCELES (dois lados iguais) ou ESCALENO (todos os
lados diferentes) . EQUILÁTERO → (A = B) E (B = C) ;
ISÓSCELES → (A = B) OU (A= C) OU (B = C) ;
ESCALENO → (A <> B) E (B <> C)
 */

import java.util.Scanner;

public class C022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho Lado A triangulo: ");
        int ladoA = scanner.nextInt();
        System.out.print("Tamanho Lado B triangulo: ");
        int ladoB = scanner.nextInt();
        System.out.print("Tamanho Lado C triangulo: ");
        int ladoC = scanner.nextInt();

        String tipoTriangulo;
        if ((ladoA == ladoB) && (ladoB == ladoC)){
            tipoTriangulo = "Equilátero";
        } else if ((ladoA == ladoB) || (ladoA == ladoC) ||
                   (ladoB == ladoC)){
            tipoTriangulo = "Isósceles";
        } else {
            tipoTriangulo = "Escaleno";
        }
        System.out.printf("Triângulo do tipo %s", tipoTriangulo);
    }
}
