package aula05;

/*
M005 Dado uma matriz de ordem 4x4 faça um algoritmo que:
a) Calcule a soma dos elementos da primeira coluna ;
b) Calcule o produto dos elementos da primeira linha;
c) Calcule a soma de todos os elementos da matriz;
d) Calcule a soma do diagonal principal;
e) Calcule a soma da diagonal secundária.
*/

/* Diagrama de Classes
@startuml

class M005App {
  + main()
}


class Matriz {
  - int[][] matriz

  + Matriz(int linhas, int colunas)
  - void preencherMatriz()

  +imprimir()
  +imprimirEstatisticas()

  - int somaElementosPrimeiraColuna()
  - int produtoElementosPrimeiraLinha()
  - int somaTodosElementosMatriz()
  - int somaDiagonalPrincipal()
  - int somaDiagonalSecundaria()

}

M005App --> Matriz

@enduml
*/

public class M005App {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(4, 4);

        matriz.imprimir();
        matriz.imprimirEstatisticas();
    }
}
