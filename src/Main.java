import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = "Maiara Barbosa Nunes";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        String asteriscos = "*********************************";
        String dadosIniciais = "Dados iniciais do cliente:";
        String operacoes = "Operações";
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        System.out.println(asteriscos + "\n" + "\n" + dadosIniciais + "\n");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldoInicial);
        System.out.println("\n" + asteriscos);


        System.out.println("\n" + operacoes + "\n");

        String menu = """
                1 - Consultar saldo
                2 - Receber valor
                3 - Tranferir valor
                4 - Sair
                """;

        while (opcao != 4) {
            System.out.println("\n" + menu);
            System.out.println("\n" + "Digite a opção desejada: ");
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: R$" + saldoInicial);
                    break;
                case 2:
                    double valorReceber = 0;
                    System.out.println("Informe o valor a receber: ");
                    valorReceber = leitura.nextDouble();
                    saldoInicial += valorReceber;
                    System.out.println("Saldo atualizado R$" + saldoInicial);
                    break;
                case 3:
                    double transferirValor = 0;
                    System.out.println("Informe o valor que deseja transferir: ");
                    transferirValor = leitura.nextDouble();
                    if (transferirValor > saldoInicial) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else {
                        saldoInicial -= transferirValor;
                        System.out.println("Saldo atualizado R$" + saldoInicial);
                    }
                    break;
                case 4:
                    System.out.println("Obrigada por utilizar nosso banco, até logo!");
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
        }

    }

}
