package simulado.primo;

public class Matematica {
    public boolean ehPrimo(long numero) {
        long divisor = 2;

        while (divisor < numero){
            if (numero % divisor == 0){
                return false;
            }
            divisor++;
        }

        return true;
    }

    public long somaPrimosMenorQue(long numero) {
        long somaPrimos = 0;
        for (long divisor = 2; divisor <= numero; divisor++){
            if (this.ehPrimo(divisor)){
                somaPrimos += divisor;
            }
        }

        return somaPrimos;
    }
}
