package aula04;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = null;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar Conta");
            System.out.println("2. Abrir Conta");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Pagar Mensalidade");
            System.out.println("6. Exibir Dados");
            System.out.println("7. Fechar Conta");
            System.out.println("8. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do dono da conta: ");
                    String dono = scanner.nextLine();
                    conta = new Conta(dono);
                    System.out.println("Conta criada com sucesso para " + dono + "!");
                    break;

                case 2:
                    if (conta == null) {
                        System.out.println("Você deve criar uma conta primeiro.");
                    } else {
                        System.out.print("Digite o tipo de conta (cc para corrente, cp para poupança): ");
                        String tipo = scanner.nextLine();
                        conta.abrirConta(tipo);
                        System.out.println("Conta aberta com sucesso!");
                    }
                    break;

                case 3:
                    if (conta == null) {
                        System.out.println("Conta não foi criada.");
                    } else {
                        System.out.print("Digite o valor do depósito: ");
                        float valor = scanner.nextFloat();
                        scanner.nextLine(); // Consume the newline
                        conta.depositar(valor);
                        System.out.println("Depósito realizado com sucesso!");
                    }
                    break;

                case 4:
                    if (conta == null) {
                        System.out.println("Conta não foi criada.");
                    } else {
                        System.out.print("Digite o valor do saque: ");
                        float valor = scanner.nextFloat();
                        scanner.nextLine(); // Consume the newline
                        conta.sacar(valor);
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;

                case 5:
                    if (conta == null) {
                        System.out.println("Conta não foi criada.");
                    } else {
                        conta.pagarMensalidade();
                        System.out.println("Mensalidade paga com sucesso!");
                    }
                    break;

                case 6:
                    if (conta == null) {
                        System.out.println("Conta não foi criada.");
                    } else {
                        conta.dados();
                    }
                    break;

                case 7:
                    if (conta == null) {
                        System.out.println("Conta não foi criada.");
                    } else {
                        conta.fecharConta();
                        conta = null; // Limpa a referência à conta
                    }
                    break;

                case 8:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        System.out.println("Sistema encerrado.");
        scanner.close();
    }
}
