package aula05;

public class ItemComanda {
    public final int codigo;
    public final String tipo;
    public final String descricao;
    public final int calorias;

    public ItemComanda(int codigo, String tipo,
                       String descricao, int calorias) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.descricao = descricao;
        this.calorias = calorias;
    }
}
