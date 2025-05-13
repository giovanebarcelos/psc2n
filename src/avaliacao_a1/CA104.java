package avaliacao_a1;

import java.util.Random;

public class CA104 {
    private int[][] matriz;

    public CA104(int tamanhoMatriz) {
        this.matriz = new int[tamanhoMatriz][tamanhoMatriz];

        this.preencherMatriz();
    }

    private void preencherMatriz() {
        Random random = new Random();
        for (int lin = 0; lin < this.matriz.length; lin++){
            for (int col = 0; col < this.matriz[lin].length; col++){
                this.matriz[lin][col] = random.nextInt(200);
            }
        }
    }

    public static void main(String[] args) {
        CA104 matriz = new CA104(3);

        matriz.imprimirMediaMatriz();
    }

    private void imprimirMediaMatriz() {
        int mediaMatriz = this.getMediaMatriz();

        System.out.printf("\nA média é: %d\n", mediaMatriz);
    }

    private int getMediaMatriz() {
        int totalMatriz = this.getTotalMatriz(),
                qtdeElementosMatriz = this.getQtdeElementosMatriz();

        return totalMatriz / qtdeElementosMatriz;
    }

    private int getQtdeElementosMatriz() {
        return this.matriz.length * this.matriz.length;
    }

    private int getTotalMatriz() {
        int totalMatriz = 0;

        for (int lin = 0; lin < this.matriz.length; lin++){
            for (int col = 0; col < this.matriz[lin].length; col++){
                totalMatriz += this.matriz[lin][col];
            }
        }
        return totalMatriz;
    }
}
