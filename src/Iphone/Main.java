package Iphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = -1;
        Scanner sc = new Scanner(System.in);
        while (opcao != 0) {
            System.out.println(" 1 = Aparelho Telefônico");
            System.out.println(" 2 = Navegador na Internet");
            System.out.println(" 3 = Reprodutor Musical");
            System.out.println("SAIR 0");
            opcao = sc.nextInt();

            if (opcao == 1) {
                int opcaoIphone;
                do {
                    System.out.println("APARELHO TELEFÔNICO");
                    System.out.println(" 1 = Ligar");
                    System.out.println(" 2 = Atender");
                    System.out.println(" 3 = Iniciar Correio de Voz");
                    System.out.println("VOLTAR 0");
                    opcaoIphone = sc.nextInt();
                    if (opcaoIphone == 1) {
                        System.out.println("Ligando o aparelho telefônico...");
                    } else if (opcaoIphone == 2) {
                        System.out.println("Atendendo uma chamada...");
                    } else if (opcaoIphone == 3) {
                        System.out.println("Iniciando o correio de voz...");
                    } else if (opcaoIphone == 0) {
                        System.out.println("Voltando ao menu principal...");
                    } else {
                        System.out.println("Opção inválida. Digite um número válido.");
                    }
                    System.out.println();
                } while (opcaoIphone != 0);
            } else if (opcao == 2) {
                int opcaoNavegador;
                do {
                    System.out.println("NAVEGADOR NA INTERNET");
                    System.out.println(" 1 = Exibir Página");
                    System.out.println(" 2 = Adicionar Nova Aba");
                    System.out.println(" 3 = Atualizar Página");
                    System.out.println("VOLTAR 0");
                    opcaoNavegador = sc.nextInt();
                    if (opcaoNavegador == 1) {
                        System.out.println("Exibindo a página...");
                    } else if (opcaoNavegador == 2) {
                        System.out.println("Adicionando uma nova aba...");
                    } else if (opcaoNavegador == 3) {
                        System.out.println("Atualizando a página...");
                    } else if (opcaoNavegador == 0) {
                        System.out.println("Voltando ao menu principal...");
                    } else {
                        System.out.println("Opção inválida. Digite um número válido.");
                    }
                    System.out.println();
                } while (opcaoNavegador != 0);
            } else if (opcao == 3) {
                int opcaoReprodutor;
                do {
                    System.out.println("REPRODUTOR MUSICAL");
                    System.out.println(" 1 = Tocar");
                    System.out.println(" 2 = Pausar");
                    System.out.println(" 3 = Selecionar Música");
                    System.out.println("VOLTAR 0");
                    opcaoReprodutor = sc.nextInt();
                    if (opcaoReprodutor == 1) {
                        System.out.println("Tocando a música...");
                    } else if (opcaoReprodutor == 2) {
                        System.out.println("Pausando a música...");
                    } else if (opcaoReprodutor == 3) {
                        System.out.println("Selecionando uma música...");
                    } else if (opcaoReprodutor == 0) {
                        System.out.println("Voltando ao menu principal...");
                    } else {
                        System.out.println("Opção inválida. Digite um número válido.");
                    }
                    System.out.println();
                } while (opcaoReprodutor != 0);
            }
        }
        sc.close();
    }
}