package avaliacao_a1;

import java.util.Scanner;

public class CA105 {
    public static void main(String[] args) {
        CA105 perfeito = new CA105();

        perfeito.verificarNumeroPerfeito();
    }

    private void verificarNumeroPerfeito() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (this.ehPerfeito(numero)){
            System.out.printf("Número %d é perfeito", numero);
        } else {
            System.out.printf("Número %d não é perfeito", numero);
        }
    }

    private boolean ehPerfeito(int numero) {
        int somaDivisores = 0;
        for (int divisor = 1; divisor < numero; divisor++){
            if (numero % divisor == 0){
                somaDivisores += divisor;
            }
        }

        return somaDivisores == numero;
    }
}
