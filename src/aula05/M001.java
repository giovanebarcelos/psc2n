package aula05;

public class M001 {
    public static void main(String[] args) {
        Comanda comanda = new Comanda();

        comanda.lerComanda();

        System.out.printf("\nTotal de Calorias: %d",
                comanda.getTotalCaloriasComanda());
    }
}
