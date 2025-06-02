public class Vampiro extends MortoVivo {

    public Vampiro(int vida, int saude, int destreza, int experiencia, double peso, int quantidadeItem) {
        super(vida, saude, destreza, experiencia, peso, quantidadeItem);
    }

public void ganharVida() {
        //ganha vida +3 na saude quando invocado este método
        this.saude = Math.min(getVida(), this.saude + 3);
        System.out.println("Vampiro ganhou vida! Saúde atual: " + this.saude);
    }
}
