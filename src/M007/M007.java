package M007;

/*
M007 Dado uma matriz quadrada de ordem 3 de valores reais faça um
algoritmo preenchida com dados aleatórios imprima os seguintes dados:
a) Qual a Soma dos valores de cada coluna da matriz;
b) Listar os valores que são menores que a média dos valores;
c) Qual a soma dos elementos da diagonal secundária;
 */

public class M007 {
    public static void main(String[] args) {
        float[][] matriz = {{12.3f, 13.8f, 8.13f},{73.8f, 8.73f, 13.36f},
                {8.0f, 13.0f, 21.0f}};

        float[] somaColuna = new float[matriz.length];
        float totalMatriz = 0f, somaDiagonalSecundaria = 0f;

        for (int lin = 0; lin < matriz.length; lin++){
            for (int col = 0; col < matriz[lin].length; col++){
                somaColuna[col] += matriz[lin][col];
                totalMatriz += matriz[lin][col];

                if ( (lin + col) == matriz.length-1){
                    somaDiagonalSecundaria += matriz[lin][col];;
                }
            }
        }

        System.out.printf("\na) Soma das Colunas: ");
        for (int col = 0; col < somaColuna.length; col++) {
            System.out.printf("[%d] = %6.2f;", col, somaColuna[col]);
        }

        float mediaValoresMatriz = totalMatriz / ( matriz.length * matriz.length );

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

        System.out.printf("c) Soma diagonal secundária: %6.2f",
                somaDiagonalSecundaria);
    }
}
