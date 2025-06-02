
import java.util.ArrayList;
import java.util.Random;

public abstract class Criatura {

    public int vida;
    public int saude;
    public int destreza;
    public int experiencia;
    public double peso;
    public ArrayList<Item> itens;
    public int quantidadeItem;

    public Criatura(int vida, int saude, int destreza, int experiencia, double peso, int quantidadeItem) {
        this.vida = vida;
        this.saude = saude;
        this.destreza = destreza;
        this.experiencia = experiencia;
        this.peso = peso;
        this.itens = new ArrayList<>();
        this.quantidadeItem = quantidadeItem;
    }

    public int getVida() {
        return vida;
    }

    public int getSaude() {
        return saude;
    }

    public int getDestreza() {
        return destreza;
    }

    public double getPeso() {
        return peso;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public int atacar() {
        if (destreza <= 0) {
            System.out.println("Destreza inválida, ataque não pode ser realizado.");
            return 0; // Retorna 0 para indicar que não causou dano
        }

        Random sorte = new Random();
        int forcaAtaque = sorte.nextInt(destreza) + 1; // Gera um ataque entre 1 e destreza
        return forcaAtaque;
    }

    //Adiciona a quantidade de itens um novo tipo de peso
    public int calcularPesoItem(Item item) {
        this.quantidadeItem = (int) (getQuantidadeItem() + item.peso);
        return getQuantidadeItem();
    }

    public void adicionarItem(Item item) {
        if (itens.size() < peso) { // Verifique se a quantidade de itens é menor que o peso,
            itens.add(item);        //para adicionar o item na criatura
            System.out.println("Item adicionado: " + item.getDescricao());
        } else {
            System.out.println("Peso máximo excedido!");
        }

    }
}
