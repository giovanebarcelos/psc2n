package aula04;

/*
M006 Dado uma matriz quadrada de ordem 3 faça um algoritmo que verifique se a matriz é
simétrica (aij=aji).
 */
public class M006 {
    public static void main(String[] args) {
        int[][] m1 = {{3,8,7},{8,9,12},{7,12,6}};
        int[][] m2 = {{1,2,3},{4,5,6},{7,8,9}};

        Matriz matriz = new Matriz();

        System.out.println("M1 é simétrica? "+
                            matriz.ehSimetrico(m1));
        System.out.println("M2 é simétrica? "+
                            matriz.ehSimetrico(m2));
    }
}
