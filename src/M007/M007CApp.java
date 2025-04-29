package M007;

/*
M007 Dado uma matriz quadrada de ordem 3 de valores reais faça um
algoritmo preenchida com dados aleatórios imprima os seguintes dados:
a) Qual a Soma dos valores de cada coluna da matriz;
b) Listar os valores que são menores que a média dos valores;
c) Qual a soma dos elementos da diagonal secundária;
*/
/*
@startuml

class M007CApp {
  + main()
}

class M007C {
  - float[][] matriz

  + M007C(int linhas, int colunas)
  - preencherMatriz()
  - float[] getSomaValoresColunasMatriz()
  + imprimirSomaValoresColunasMatriz()
  - float getTotalMatriz()
  - float getMediaValoresMatriz()
  + listarValoresMenoresMedia()
  - float getSomaDiagonalSecundaria()
  + imprimirSomaDiagonalSecundaria()
}

M007CApp --> M007C : Usa

@enduml
 */
public class M007CApp {
    public static void main(String[] args) {
        M007C matriz = new M007C(3, 3);

        matriz.imprimirSomaValoresColunasMatriz();
        matriz.listarValoresMenoresMedia();
        matriz.imprimirSomaDiagonalSecundaria();
    }
}
