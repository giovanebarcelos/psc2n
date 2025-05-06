package simulado.fatorial;

import java.util.Scanner;

public class Fatorial {
    public void calcularMostrarFatorialDeUmNumero() {
        int numero = this.lerNumero();
        int fatorial = this.getFatorial(numero);

        System.out.printf("\n\nFatorial do número %d é %d",
                numero, fatorial);
    }

    private int getFatorial(int numero) {
        int fatorial = 1;

        while (numero > 1) {
            fatorial *= numero;
            numero--;
        }

        return fatorial;
    }

    private int lerNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        return numero;
    }
}
