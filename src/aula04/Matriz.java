package aula04;

public class Matriz {
    public boolean ehSimetrico(int[][] a) {
        boolean simetrico = true;

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                simetrico = simetrico && a[i][j] == a[j][i];
            }
        }

        return simetrico;
    }
}
