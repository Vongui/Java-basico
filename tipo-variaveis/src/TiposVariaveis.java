/**
 *
 * @author Vongui
 */
public class TiposVariaveis {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;
        // é necessário colocar ao final do valor da variavel a primeira letra do tipo
        // nas variaveis de tipo long e float
        long cpf = 984562234243L;
        float  pi = 3.14F;
        double salarioMinimo = 1275.33;
        
        // Exemplo de tipagem do java
        //short numeroCurto = 1;
        //int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal;
        /*  Nesse exemplo o java vai dar um erro de tipagem
            quando faz a conversão de int para short
            mesmo que o valor que está armazenado "caíba"
            na outra variavel o java não aceitará
        */
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        // o Exemplo acima só funcionará se houver um cast na ultima linha
        
        
        // Exemplo de Manipulação de variavel
        int numero = 20;
        System.out.println(numero);
        numero = 2;
        System.out.println(numero);
        // Nesse exemplo a variavel foi declarada com um valor logo após o valor 
        // foi printado na tela e em seguida foi alterado o valor da mesma variavel
        // e printada novamente
        
        // Exemplo de Variavel Final
        final int NUMFINAL = 1; // esse valor nunca poderá mudar pois se trata 
        // de uma constante que é representada pela palavra erservada "final"
        System.out.println(NUMFINAL);
        NUMFINAL = 20; // Vai ser apontado um erro
        
    }
}
