public abstract class Item {
    public String descricao;
    public double peso;

    public Item(String descricao, double peso) {
        this.descricao = descricao;
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPeso() {
        return peso;
    }
}
