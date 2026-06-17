import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("---- Sistema Bancário ----");
            System.out.println("1 -> Criar conta");
            System.out.println("2 -> Ver saldo");
            System.out.println("3 -> Depositar");
            System.out.println("4 -> Sacar");
            System.out.println("5 -> Sair");
            System.out.println("Escolha um opção: ");

            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Criando conta");
                    break;

                case 2:
                    System.out.println("Saldo atual: ...");
                    break;

                case 3:
                    System.out.println("Valor do depósito: ...");
                    break;

                case 4:
                    System.out.println("Valor a sacar: ...");
                    break;

                case 5:
                    System.out.println("Saindo...");

            }
        } while (opcao != 5);

        scanner.close();
    }
}
