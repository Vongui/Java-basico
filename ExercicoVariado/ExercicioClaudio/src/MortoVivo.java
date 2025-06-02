public class MortoVivo extends Criatura {

    public MortoVivo(int vida, int saude, int destreza, int experiencia, double peso, int quantidadeItem) {
        super(vida, saude, destreza, experiencia, peso, quantidadeItem);
    }

    public void tratarVida(int ataque) {
        // Se o ataque for maior que 7, perde apenas 7 pontos de saúde
        if (ataque > 7) {
            ataque = 7; // Ajusta o ataque para 7
        }
        this.saude -= ataque; // Reduz a saúde de acordo com o ataque ajustado
        // Exibir saúde após o ataque
        System.out.println("Morto Vivo agora tem " + this.saude + " de saúde.");
    }
}
