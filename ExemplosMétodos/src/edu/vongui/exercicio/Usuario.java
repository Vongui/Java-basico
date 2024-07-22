package edu.vongui.exercicio;

/**
 *
 * @author Vongui
 */
public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("Tv esta ligada? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Tv esta ligada? "+smartTv.ligada);
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: "+smartTv.volume);
        
        smartTv.mudarCanal();
        System.out.println("Canal atual: "+smartTv.canal);
        
        smartTv.mudarCanal(7);
        System.out.println("Canal atual: "+smartTv.canal);
        
    }
}
