import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RPG {

    static Scanner ler = new Scanner(System.in);
    static List<Criatura> criaturas = new ArrayList<>(); // Lista para armazenar as criaturas

    public static void main(String[] args) {
        boolean vitoria = false;
        int op;

        do {
            op = menu();
            switch (op) {
                case 1 -> {
                    if (criaturas.size() < 2) { // Verifica se já temos 2 criaturas
                        
                        int op2 = mostrarCriaturas();
                        Criatura criatura = null; // Criar uma referência genérica para a criatura

                        switch (op2) {
                            // vida, saude, destreza, experiencia, peso, quantidadeitem consecutivamente
                            case 1 -> criatura = new Guerreiro(100, 100, 40, 30, 35, 0);
                            case 2 -> criatura = new Paladino(100, 100, 35, 35, 30, 0);
                            case 3 -> criatura = new MortoVivo(100, 80, 34, 20, 25, 0);
                            case 4 -> criatura = new Vampiro(100, 100, 32, 33, 30, 0);
                            default -> System.out.println("Opção inválida");
                        }

                        if (criatura != null) {
                            criaturas.add(criatura); // Adiciona a criatura à lista
                            adicionarItens(criatura); // Chama método para adicionar itens
                        }
                    } else {
                        System.out.println("Já existem 2 criaturas, não é possível adicionar mais.");
                    }
                }
                
                case 2 -> {
                    if (criaturas.size() < 2) { // Enquanto não tiver duas criaturas adicionadas no arraylist
                        System.out.println("É necessário adicionar 2 criaturas para começar a luta.");
                    } else {
                        System.out.println("Iniciando a luta...");
                        Random sorte = new Random();

                        while (!vitoria) {
                            // Escolher aleatoriamente um atacante do Array de criaturas
                            int atacanteIndice = sorte.nextInt(criaturas.size());
                            int defensorIndice;
                            do {
                                defensorIndice = sorte.nextInt(criaturas.size());
                            } while (defensorIndice == atacanteIndice); // Garante que o defensor não é o mesmo que o atacante

                            Criatura atacante = criaturas.get(atacanteIndice);
                            Criatura defensor = criaturas.get(defensorIndice);

                            // Realizar ataque
                            int dano = atacante.atacar();
                            
                            //Retorna o nome da classe do atacante e o nome da classe que esta sendo atacada
                            System.out.println(atacante.getClass().getSimpleName() + 
                                    " ataca " + defensor.getClass().getSimpleName() + 
                                    " causando " + dano + " de dano.");

                            // Se o defensor for um MortoVivo, trata o dano usando o método tratarVida
                            if (defensor instanceof MortoVivo mortoVivo) {
                                mortoVivo.tratarVida(dano);
                            } else {
                                defensor.saude -= dano; // Para outras criaturas, diminui a saúde normalmente
                            }

                            // Verificar se o defensor é um Vampiro
                            if (defensor instanceof Vampiro vampiro) {
                                // Verifica se o dano causado é menor que a defesa do vampiro
                                if (dano < vampiro.getDestreza()) {
                                    vampiro.ganharVida(); // Chama o método para ganhar vida
                                    System.out.println(vampiro.getClass().getSimpleName() + 
                                        " ganhou vida! Saúde atual: " + vampiro.getSaude());
                                }
                            } else {
                                System.out.println(defensor.getClass().getSimpleName() + 
                                    " agora tem " + defensor.getSaude() + " de saúde.");
                            }

                            // Verificar se o defensor foi derrotado
                            if (defensor.getSaude() <= 0) {
                                System.out.println(defensor.getClass().getSimpleName() + " foi derrotado!");
                                criaturas.remove(defensorIndice); // Remove a criatura derrotada
                                //Se o array for igual a 1 mostra o vencedor que está dentro da lista
                                //Retornando o nome dele e encerrando o looping 
                                if (criaturas.size() == 1) {
                                    System.out.println("A luta terminou! " + criaturas.get(0).getClass().getSimpleName() + " venceu!");
                                    vitoria = true; // Termina a luta
                                }
                            }
                        }
                    }
                }
                case 3 -> System.out.println("Programa encerrado");

                default -> System.out.println("Opção inválida");
            }
        } while (op != 3);
    }

    private static void adicionarItens(Criatura criatura) {
        int opcao;
        do {
            opcao = mostrarMenuItem();
            //Este método adiciona itens a criatura escolhida pelo usuario em relação ao item escolhido
            switch (opcao) {
                case 1 -> {
                    int opcaoAdicionar = mostrarTodosOsItens();
                    switch (opcaoAdicionar) {
                        case 1 -> {
                            if (criatura.quantidadeItem + 5 <= criatura.peso) {
                                ItemCajado cajado = new ItemCajado("Cajados das infinitas terras", 5);
                                criatura.adicionarItem(cajado);
                            } else {
                                System.out.println("Peso máximo excedido!");
                            }
                    }
                        case 2 -> {
                            if (criatura.quantidadeItem + 3 <= criatura.peso) {
                                ItemEspada espada = new ItemEspada("Espada do destino", 3);
                                criatura.adicionarItem(espada);
                            } else {
                                System.out.println("Peso máximo excedido!");
                            }
                    }
                        case 3 -> {
                            if (criatura.quantidadeItem + 2 <= criatura.peso) {
                                ItemLivroDaVida livro = new ItemLivroDaVida("Livros dos monges", 2);
                                criatura.adicionarItem(livro);
                            } else {
                                System.out.println("Peso máximo excedido!");
                            }
                    }
                        case 4 -> {
                            if (criatura.quantidadeItem + 4 <= criatura.peso) {
                                ItemMantoSagrado manto = new ItemMantoSagrado("Manto da alvorada", 4);
                                criatura.adicionarItem(manto);
                            } else {
                                System.out.println("Peso máximo excedido!");
                            }
                    }
                        case 5 -> {
                            if (criatura.quantidadeItem + 2 <= criatura.peso) {
                                ItemPocaoDeSangue sangue = new ItemPocaoDeSangue("Sangue de virgens do imalaia", 2);
                                criatura.adicionarItem(sangue);
                            } else {
                                System.out.println("Peso máximo excedido!");
                            }
                    }
                        default -> System.out.println("Opcao inválida");
                    }
                }
                case 0 -> System.out.println("Saiu de adicionar itens..");
                default -> System.out.println("Opcao invalida");
            }
        } while (opcao != 0);
    }

    private static int menu() {
        int op;
        System.out.println("[01] Adicionar Campeão para luta");
        System.out.println("[02] Começar luta");
        System.out.println("[03] Encerrar jogo");
        System.out.print("Digite uma opção: ");
        op = ler.nextInt();
        return op;
    }

    private static int mostrarCriaturas() {
        int op;
        System.out.println("[01] Guerreiro");
        System.out.println("[02] Paladino");
        System.out.println("[03] Morto Vivo");
        System.out.println("[04] Vampiro");
        System.out.print("Digite uma opção: ");
        op = ler.nextInt();
        return op;
    }

    private static int mostrarMenuItem() {
        int opcao;
        System.out.println("[1] Adicionar item");
        System.out.println("[0] Não adicionar item");
        System.out.print("Digite uma opção: ");
        opcao = ler.nextInt();
        return opcao;
    }

    private static int mostrarTodosOsItens() {
        int opcao;
        System.out.println("[1] Cajado");
        System.out.println("[2] Espada");
        System.out.println("[3] Livro da Vida");
        System.out.println("[4] Manto Sagrado");
        System.out.println("[5] Poção de sangue");
        System.out.print("Digite uma opção: ");
        opcao = ler.nextInt();
        return opcao;
    }
}