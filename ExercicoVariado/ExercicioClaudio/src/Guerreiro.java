public class Guerreiro extends Criatura{

    public Guerreiro(int vida, int saude, int destreza, int experiencia, double peso, int quantidadeItem) {
        super(vida, saude, destreza, experiencia, peso, quantidadeItem);
    }



    @Override
    public int atacar()
    {
        int forcaGuerreiro;
        forcaGuerreiro = super.atacar();
        if(forcaGuerreiro < 5)
        {
            forcaGuerreiro = 5;
            
        }
        this.destreza = forcaGuerreiro;
        return forcaGuerreiro;
    }
}
