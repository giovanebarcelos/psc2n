package simulado;
/*
A104) (1,5 ptos) Escreva um algoritmo que leia uma matriz quadrada
de sétima ordem M(3,3), 3 linhas e 3 colunas, e efetue a soma dos
elementos da diagonal principal (canto superior esquerdo ao canto
inferior direito). Depois de calculado mostre a soma na tela.
 */

public class A104 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};

        int soma = 0;
        for (int lin = 0; lin < matriz.length; lin++){
            for (int col = 0; col < matriz[lin].length; col++){
                if ( lin == col ){
                    soma += matriz[lin][col];
                }
            }
        }
        System.out.printf("\n\nA soma da diagonal principal é %d",
                soma);

    }

}
