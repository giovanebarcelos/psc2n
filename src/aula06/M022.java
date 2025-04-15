package aula06;

public class M022 {
    public static void main(String[] args) {
        int[] numeros = {9,6,5,6,3,5};
        boolean[] visitado = new boolean[numeros.length];
        for (int pos = 0; pos < numeros.length; pos++){
            visitado[pos] = true;
            boolean numImpresso = false;
            for (int repetido = 0; repetido < numeros.length; repetido++){
                if ( visitado[repetido] == false &&
                        numeros[repetido] == numeros[pos] ){
                    if (! numImpresso){
                        System.out.printf("\n%d = %d", numeros[pos], pos );
                        numImpresso = true;
                    }
                    System.out.printf(" %d", repetido);
                    visitado[repetido] = true;
                }
            }
        }
    }
}
