package aula05;

public class M005 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}, {13, 14, 15,16}};

        int somaElementosPrimeiraColuna = 0,
                produtoElementosPrimeiraLinha = 1,
                somaTodosElementosMatriz = 0,
                somaDiagonalPrincipal = 0,
                somaDiagonalSecundaria = 0;

        System.out.printf("%8s %6d %6d %6d %6d", "Matriz", 0, 1, 2, 3);
        for (int linha = 0; linha < matriz.length; linha++){
            System.out.printf("\n%8d ", linha);
            for (int coluna = 0; coluna < matriz.length; coluna++){
                System.out.printf("%6d ", matriz[linha][coluna]);

                if (coluna == 0){
                    somaElementosPrimeiraColuna += matriz[linha][coluna];
                }
                if (linha == 0) {
                    produtoElementosPrimeiraLinha *= matriz[linha][coluna];
                }

                somaTodosElementosMatriz += matriz[linha][coluna];

                if (linha == coluna){
                    somaDiagonalPrincipal += matriz[linha][coluna];
                }

                if (linha + coluna == 3){
                    somaDiagonalSecundaria += matriz[linha][coluna];
                }
            }
        }

        System.out.printf("\na) Soma dos elementos da primeira coluna: %d",
                somaElementosPrimeiraColuna);
        System.out.printf("\nb) Produto dos elementos da primeira linha: %d",
                produtoElementosPrimeiraLinha);
        System.out.printf("\nc) Soma de todos os elementos da matriz: %d",
                somaTodosElementosMatriz);
        System.out.printf("\nd) Soma do diagonal principal: %d",
                somaDiagonalPrincipal);
        System.out.printf("\ne) Soma da diagonal secundária: %d",
                somaDiagonalSecundaria);
    }
}
