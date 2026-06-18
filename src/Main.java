import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Conta conta = null;
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
            scanner.nextLine();

            switch (opcao){
                case 1:

                    System.out.println("Digite seu nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o número da conta: ");
                    Integer numeroConta = scanner.nextInt();
                    System.out.println("Criando conta...");
                    System.out.println("Nome: " + nome);
                    System.out.println("Conta: " + numeroConta);
                    conta = new Conta(nome, numeroConta);
                    System.out.println("Conta criada com sucesso!");

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
