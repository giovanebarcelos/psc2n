package simulado.fatorial;

/*
A103) (1,5 ptos) Escreva um programa que leia um valor inteiro,
calcule e mostre o seu fatorial. Fatorial de um número natural n,
representado por n!, é o produto de todos os inteiros positivos menores ou
iguais a n.
Exemplo: 3! = 6, ou seja, 1 x 2 x 3 = 6.
 */

public class A103App {
    public static void main(String[] args) {
        Fatorial fatorial = new Fatorial();

        fatorial.calcularMostrarFatorialDeUmNumero();
    }
}
