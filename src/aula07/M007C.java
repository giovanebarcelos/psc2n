package aula07;

import java.util.Random;

public class M007C {
    private float[][] matriz;

    public M007C(int linhas, int colunas) {
        this.matriz = new float[linhas][colunas];
        this.preencherMatriz();
    }

    private void preencherMatriz() {
        float min = 1f, max = 100f;
        Random random = new Random();

        for (int lin = 0; lin < this.matriz.length; lin++){
            for (int col = 0; col < this.matriz.length; col++){
                //float valor = min + random.nextFloat() * (max - min);
                float valor = random.nextFloat(101);
                this.matriz[lin][col] = valor;
             }
        }
    }

    public void imprimirSomaValoresColunasMatriz() {
        float[] somaValoresColunasMatriz = this.getSomaValoresColunasMatriz();

        System.out.printf("\na) Soma das Colunas: ");
        for (int col = 0; col < somaValoresColunasMatriz.length; col++) {
            System.out.printf("[%d] = %6.2f;", col, somaValoresColunasMatriz[col]);
        }
    }

    private float[] getSomaValoresColunasMatriz() {
        float[] somaValoresColunasMatriz = new float[this.matriz.length];

        for (int lin = 0; lin < this.matriz.length; lin++){
            for (int col = 0; col < this.matriz.length; col++){
                somaValoresColunasMatriz[col] +=  this.matriz.length;
            }
        }

        return somaValoresColunasMatriz;
    }

    public void listarValoresMenoresMedia() {
        float mediaValoresMatriz = this.getMediaValoresMatriz();

        System.out.printf("\nb) Valores menores que a média (%6.2f): \n",
                mediaValoresMatriz);
        for (int lin = 0; lin < matriz.length; lin++){
            for (int col = 0; col < matriz[lin].length; col++){
                if (matriz[lin][col] < mediaValoresMatriz){
                    System.out.printf("- matriz[%d][%d] = %6.2f\n",
                            lin, col, matriz[lin][col]);
                }
            }
        }
    }

    private float getMediaValoresMatriz() {
        float totalMatriz = this.getTotalMatriz();

        return totalMatriz / (this.matriz.length * this.matriz.length);

    }

    private float getTotalMatriz() {
        float totalMatriz = 0f;

        for (int lin = 0; lin < this.matriz.length; lin++){
            for (int col = 0; col < this.matriz.length; col++){
                totalMatriz +=  this.matriz[lin][col];
            }
        }

        return totalMatriz;
    }

    public void imprimirSomaDiagonalSecundaria() {
        float somaDiagonalSecundaria = this.getSomaDiagonalSecundaria();

        System.out.printf("c) Soma diagonal secundária: %6.2f",
                somaDiagonalSecundaria);
    }

    private float getSomaDiagonalSecundaria() {
        float somaDiagonalSecundaria = 0f;

        for (int lin = 0; lin < matriz.length; lin++){
            for (int col = 0; col < matriz[lin].length; col++){
                if ( (lin + col) == matriz.length-1){
                    somaDiagonalSecundaria += matriz[lin][col];;
                }
            }
        }

        return somaDiagonalSecundaria;
    }
}
