package edu.vongui.exercicio;

/**
 *
 * @author Vongui
 */
public class SmartTv {

    //Criar um exemplo de uma classe para representar uma SmartTV onde :
    //1- tenhas as caracteristicas: ligada(boolean), canal(int) e volume(int)
    //2- poderá ligar e desligar 
    //3- poderá aumentar e diminuir o volume sempre em +1 ou -1
    //4- poderá mudar de canal de 1 em 1 ou definindo o número correspondente 
    
    boolean ligada = false;
    int canal = 1;
    int volume = 5;
    
    public void ligar(){
        ligada = true;
    }
    
    public void desligar(){
        ligada = false;
    }
    
    public void aumentarVolume(){
        volume++;
    }
    
    public void diminuirVolume(){
        volume--;
    }
    
    // Utilizei o conceito de sobrecarga de Orientação a objetos
    public void mudarCanal(){
        canal++;
    }
    
    public void mudarCanal(int num){
        canal = num;
    }
}
