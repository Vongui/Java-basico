public class Paladino extends Guerreiro {
    public int quantidadeRodada = 0;
    private boolean bencaoAtiva = false;

    public Paladino(int vida, int saude, int destreza, int experiencia, double peso, int quantidadeItem) {
        super(vida, saude, destreza, experiencia, peso, quantidadeItem);
    }

    public void invocarBencao() {
        if (!bencaoAtiva) {
            this.destreza += 5; // Aumenta a destreza em 5
            bencaoAtiva = true; // Marca a bênção como ativa
            quantidadeRodada = 0; // Reinicia o contador de rodadas
            System.out.println("Bênção invocada! Destreza aumentada para " + this.destreza);
        }
    }

    public void atualizarRodadas() {
        if (bencaoAtiva) {
            quantidadeRodada++;
            if (quantidadeRodada >= 3) {
                this.destreza -= 5; // Reduz a destreza de volta
                bencaoAtiva = false; // Desativa a bênção
                System.out.println("A bênção expirou. Destreza reduzida para " + this.destreza);
            }
        }
    }

    // Realiza oração
    public int realizarOracao() {
        invocarBencao();
        return this.destreza; // Retorna a destreza coma  benção
    }
}
