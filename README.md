# Repositório para armazenar as anotações e exercicos de estudos da linguagem Java  
# Sintaxe java 
## Anatomia das classes 

#### Classes e Métodos
- Nome de classes devem estar na nomenclatura PascalCase -> **MinhaClasse**
- Nome de métodos devem estar na nomenclatura camelCase -> **minhaClasse**
- Métodos precisam ser informados o tipo de dado de retorno ele precisará retornar após o fechamento. Ex: **public static int calc()** --> esse método retornará um dado do tipo inteiro
~~~java
public class MinhaClasse { // Classe

    public static void main(String [] args){ // Método
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
[Código Sem Identação](https://github.com/Vongui/Java-basico/blob/main/BoletimEstudantil/src/edu/vongui/identado/sem/BoletimEstudantil.java) | 
[Código com Identação](https://github.com/Vongui/Java-basico/blob/main/BoletimEstudantil/src/edu/vongui/identado/com/BoletimEstudantil.java) |

#### Organizando arquivos/Packages
> Um pacote ou package na tecnologia Java nada mais é do que um conjunto de classes localizadas na mesma estrutura hierárquica de diretórios. Usualmente, são colocadas em um package classes relacionadas, construídas com um propósito comum para promover a reutilização de código

Exemplos:  
com.hypertech.notification -> utilizaçao em softwares comerciais  
edu.nome.app -> utilizado para softwares para estudo
#### Tipos e Variáveis
##### Tipos de dados
Palavras reservadas para a representação dos tipos de dados básicos, sendo divididos em tipos primitivos e 

###### Tipos primitivos 
Não são considerados objetos, representado somente valores brutos.
- int
- byte
- short 
- long 
- float 
- double 
- boolean
- char

###### Declaração de variável 
É uma identificação de um espaço de memória 
~~~
// <Tipo> <nomeVariavel> <ValorOpcional>
~~~

###### Constantes
Constantes em java são representadas por "final" e devem ser escritas em caixa alta, constantes são valores que quando declarados não podem sofrer alteração de valor
~~~
// final <Tipo> <nomeVariavel> <ValorOpcional>
~~~

[Exemplos de Declaração de variavel e Constantes](https://github.com/Vongui/Java-basico/blob/main/tipo-variaveis/src/TiposVariaveis.java)

#### Operadores
Símbolos especiais que tem um significado próprio para a linguagem e estão associados a determinadas operações
##### Atribuição
Utilizado para definir o valor inicial ou sobrescrever o valor de uma variável
~~~
//Atribuição -> '='
String nome = "MARCOS";
int idade = 20;
double peso = 67.7;
char sexo = 'M';
~~~
##### Aritméticos 
Utilizado para realizar operações matemáticas e valores numéricos: + (adição), * (multiplicação), - (subtração) e / (divisão)
~~~
int soma = 10 + 12;
int subtracao = 3 - 6;
int multiplicacao = 3 * 10;
double divisao = 5/25;
int modulo = 18 % 3;
double resultado = (10 * 7) + (20 / 4);
~~~
##### Unário 
São aplicados juntamente com operadores aritméticos, sendo utilizado como: incremento, decretemento e etc...
+ (+) Operador unário de valor positivo
+ (-) Operador unário de valro negativo
+ (++) Operador unário de incremento
+ (--) Operador unário de decremento 
+ (!) Operador unário lógico de negação
~~~
int numero = 5; // por padrão o valor é positivo
numero = -5; // o valor se torna negativo
numero++; // é incrementado em 1
numero--; // é drecementado em 1

boolean escolha = true; // variavel booleana com valor de true
!escolha; // a variavel foi "negada" e recebeu o valor de false
~~~

##### Ternário
~~~
int a, b;
a = 5;
b = 6;

String resultado = a==b ? "verdadeiro" : "falso";

// Estrutura 
// <condicao> ? <se for verdadeiro> : <se for falso>;
~~~
##### Relacionais 
Definem se o operador a esquerda é igual, diferente, menor, maior, menor ou igual, maior ou igual, retornando um valor booleano como resultado
+ (==) Verifica se a variável é igual a outra
+ (!=) Verifica se a variável é diferente da outra
+ (>) Verifica se a variável é maior que a outra
+ (<) Verifica se a variável é menor que a outra
+ (>=) Verifica se a variável é maior ou igual a outra
+ (<=) Verifica se a variável é menor ou igual a outra
~~~
int numero1 = 1;
int numero2 = 2;

boolean test = numero1 == numero2; // o resultado dessa afirmação vai ser 'false'
~~~
##### Lógicos 
+ (&&) Operador lógico 'E'
+ ( || ) Operador lógico 'OU'
~~~
boolean condicao1 = false; // se mudar para true o if se torna verdadeiro
boolean condicao2 = true;

if(condicao1 && condicao2){ // condicao falsa
    System.out.println("Verdadeiras");
}
else{
    System.out.println("Falsas");
}
~~~

### Métodos
Todas as ações das aplicações são consideradas métodos
##### Critérios de nomeação
+ Deve ser nomeado como verbo
+ Seguir o padrão camelCase
Exemplo: somar(int num1, int num2){}

[Exemplo](https://github.com/Vongui/Java-basico/blob/main/ExemplosMétodos/src/edu/vongui)
## Referências 
[Java Básico](https://glysns.gitbook.io/java-basico)