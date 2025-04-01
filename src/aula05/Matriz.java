package aula05;

public class Matriz {
    int[][] matriz;

    public Matriz(int linhas, int colunas) {
        this.matriz = new int[linhas][colunas];

        this.preencherMatriz();
    }

    private void preencherMatriz() {
        int num = 1;
        for (int linha = 0; linha < this.matriz.length; linha++){
            for (int coluna = 0; coluna < this.matriz.length; coluna++){
                this.matriz[linha][coluna] = num;
                num++;
            }
        }
    }

    public void imprimir() {
        System.out.printf("%8s %6d %6d %6d %6d", "Matriz", 0, 1, 2, 3);
        for (int linha = 0; linha < this.matriz.length; linha++){
            System.out.printf("\n%8d ", linha);
            for (int coluna = 0; coluna < this.matriz.length; coluna++){
                System.out.printf("%6d ", this.matriz[linha][coluna]);
            }
        }
    }

    public void imprimirEstatisticas() {
        System.out.printf("\na) Soma dos elementos da primeira coluna: %d",
                this.somaElementosPrimeiraColuna());
        System.out.printf("\nb) Produto dos elementos da primeira linha: %d",
                this.produtoElementosPrimeiraLinha());
        System.out.printf("\nc) Soma de todos os elementos da matriz: %d",
                this.somaTodosElementosMatriz());
        System.out.printf("\nd) Soma do diagonal principal: %d",
                this.somaDiagonalPrincipal());
        System.out.printf("\ne) Soma da diagonal secundária: %d",
                this.somaDiagonalSecundaria());
    }

    private int somaDiagonalSecundaria() {
        int somaDiagonalSecundaria = 0;

        for (int linha = 0, coluna = 3;
             linha < this.matriz.length;
             linha++, coluna--){
            somaDiagonalSecundaria += this.matriz[linha][coluna];
        }

        return somaDiagonalSecundaria;
    }

    private int somaDiagonalPrincipal() {
        int somaDiagonalPrincipal = 0;

        for (int linha = 0; linha < this.matriz.length; linha++){
            somaDiagonalPrincipal += this.matriz[linha][linha];
        }

        return somaDiagonalPrincipal;
    }

    private int somaTodosElementosMatriz() {
        int linha = 0, somaTodosElementosMatriz = 0;

        while (linha < this.matriz.length){
            int coluna = 0;
            while (coluna < this.matriz.length){
                somaTodosElementosMatriz += this.matriz[linha][coluna];
                coluna++;
            }
            linha++;
        }

        return somaTodosElementosMatriz;
    }

    private int produtoElementosPrimeiraLinha() {
        int produtoElementosPrimeiraLinha = 1;

        for (int coluna = 0; coluna < this.matriz.length; coluna++){
            produtoElementosPrimeiraLinha *= this.matriz[0][coluna];
        }

        return produtoElementosPrimeiraLinha;
    }

    private int somaElementosPrimeiraColuna() {
        int somaElementosPrimeiraColuna = 0;

        for (int linha = 0; linha < this.matriz.length; linha++){
            somaElementosPrimeiraColuna += this.matriz[linha][0];
        }

        return somaElementosPrimeiraColuna;
    }
}
