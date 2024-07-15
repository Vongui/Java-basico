# Repositório para armazenar as anotações e exercicos de estudos da linguagem Java  
# Sintaxe java 
## Anatomia das classes 

#### Classes e Métodos
- Nome de classes devem estar na nomenclatura PascalCase -> **MinhaClasse**
- Nome de métodos devem estar na nomenclatura camelCase -> **minhaClasse**
- Métodos precisam ser informados o tipo de dado de retorno ele precisará retornar após o fechamento. Ex: **public static int calc()** --> esse método retornará um dado do tipo inteiro
~~~java
public class MinhaClasse { // Classe

    public static void main([String [] args){ // Método
        //métodos exigem parâmetros, ou seja, seguidos por "()"
        System.out.printl ("Olá mundo");
    }
} 
~~~
___
#### Padrão de nomenclatura
- Arquivo.java -> PascalCase
- Nome da classe no arquivo -> A classe deve ter o mesmo nome do arquivo
- Nome de Variável -> Se utiliza camelCase
**obs: variaveis constantes, ou seja, variaveis que não terão alteração no valor são escritas com todas as letras MAIÚSCULAS sendo separadas por sublinhado(_) se forem palavras compostas**
~~~
// Declaração inválida de variaveis
int numero&um = 1; // simbolos aceitos são somente _ ou $
int 1numero = 1; // não pode iniciar com numeros
int numero um = 1; // não pode ter espaço entre uma palavra e outra
int long numero = 1; // nomes reservados da linguagem não podem ser utilizados na nomeação de variaveis

// Declaração válida de variaveis
int numero$um = 1;
int numero1 = 1;
int numeroum = 1;
int longo = 1;

~~~
___
#### Declaração de Variável e Método
- Declarar uma variavel segue a estrutura:
~~~
//Estrutura -> Tipo NomeDefinido = Atribuição(opcional)
String nomeCompleto = "João Reis da Silva";
String nomeCompleto;

~~~
- Declarar um método segue a estrutura:
~~~
//Estrutura -> TipoRetorno NomeObjetivoNoInfinitivo (Parametro(s), n'sParametos(s), ...)
int somar (int num1, int num2)
**obs: sse utiliza public/private antes do nome do método, porém 
isso vai ser tratado mais a frente**
~~~
___
#### Identação
Basicamente indentar é um termo utilizado para escrever o código do programa de forma hierárquica, facilitando assim a visualização e o entendimento do programa.

Exemplos: | 
----------| 
[Código Sem Identação]() | 
[Código com Identação]() |

#### Organizando arquivos/Packages
> Um pacote ou package na tecnologia Java nada mais é do que um conjunto de classes localizadas na mesma estrutura hierárquica de diretórios. Usualmente, são colocadas em um package classes relacionadas, construídas com um propósito comum para promover a reutilização de código

Exemplos:  
com.hypertech.notification -> utilizaçao em softwares comerciais  
edu.nome.app -> utilizado para softwares para estudo