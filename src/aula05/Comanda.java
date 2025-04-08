package aula05;

import javax.lang.model.type.MirroredTypeException;
import java.util.ArrayList;
import java.util.Scanner;

public class Comanda {
    private ArrayList<ItemComanda> menu;
    private ArrayList<ItemComanda> comanda;

    public Comanda(){
        this.menu = new ArrayList<ItemComanda>();
        this.menu.add(new ItemComanda(
                1, "PRATO", "Vegetariano", 180));
        this.menu.add(new ItemComanda(
                2, "PRATO", "Peixe", 230));
        this.menu.add(new ItemComanda(
                3, "PRATO", "Frango", 250));
        this.menu.add(new ItemComanda(
                4, "PRATO", "Carne", 350));
        this.menu.add(new ItemComanda(
                1, "SOBREMESA", "Abacaxi", 75));
        this.menu.add(new ItemComanda(
                2, "SOBREMESA", "Sorvete diet", 110));
        this.menu.add(new ItemComanda(
                3, "SOBREMESA", "Mousse diet", 170));
        this.menu.add(new ItemComanda(
                4, "SOBREMESA", "Mousse chocolate", 200));
        this.menu.add(new ItemComanda(
                1, "BEBIDA", "Chá", 20));
        this.menu.add(new ItemComanda(
                2, "BEBIDA", "Suco Laranja", 70));
        this.menu.add(new ItemComanda(
                3, "BEBIDA", "Suco de Melão", 100));
        this.menu.add(new ItemComanda(
                4, "BEBIDA", "Refrigerante Diet", 65));
    }

    public void lerComanda() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comanda\n");

        ItemComanda prato = this.lerItemComanda(
                "Escolha o prato: ", "PRATO");
        ItemComanda sobremesa = this.lerItemComanda(
                "Escolha a sobremesa: ", "SOBREMESA");
        ItemComanda bebida = this.lerItemComanda(
                "Escolha a bebida: ", "BEBIDA");

        this.comanda = new ArrayList<ItemComanda>();
        this.comanda.add(prato);
        this.comanda.add(sobremesa);
        this.comanda.add(bebida);
    }

    private ItemComanda lerItemComanda(String descricao, String tipo){
        Scanner scanner = new Scanner(System.in);

        this.listarMenu(tipo);

        System.out.print(descricao);
        int id = scanner.nextInt();
        System.out.println();

        return this.getItemComanda(tipo, id);
    }

    private ItemComanda getItemComanda(String tipo, int id) {
        ItemComanda itemComanda = null;

        for (ItemComanda item: this.menu){
            if (tipo.equals(item.tipo) && id == item.codigo){
                itemComanda = item;
            }
        }

        return itemComanda;
    }

    private void listarMenu(String tipo) {
        for (ItemComanda itemComanda: this.menu){
            if (tipo.equals(itemComanda.tipo)) {
                System.out.printf("%d. %s\n",
                        itemComanda.codigo, itemComanda.descricao);
            }
        }
    }

    public int getTotalCaloriasComanda() {
        int calorias = 0;
        for (ItemComanda itemComanda: this.comanda){
            calorias += itemComanda.calorias;
        }

        return calorias;
    }
}
