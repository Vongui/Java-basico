package edu.vongui.metodos;

/**
 *
 * @author Vongui
 */
public class Exemplos {
    
    public double somar(int num1, int num2){
        //Lógica -> Somar os valores e retornar o resultado
        double result;
        return result = num1 + num2;
    }
    
    public void imprimir(String texto){
        // Não é necessário o return por se tratar de um método void
    }
    
    // throws Exception -> indica que o método ao ser utilizado  pode gerar uma exceção
    public double dividir(int dividendo, int divisor) throws Exception{
        return 0;
    }
    
    // este método não pode ser visto por outras classes no projeto
    // somente pela classe em que está declarado
    private void privado(){}
    
}
