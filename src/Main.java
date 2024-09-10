import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = "Maiara Barbosa Nunes";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        String asteriscos = "*********************************";

        System.out.println(asteriscos);
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldoInicial);
        System.out.println(asteriscos);

        System.out.println("Operações");

        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Tranferir valor");
        System.out.println("4 - Sair");


        int opcao = 0;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a opção desejada: ");
        opcao = leitura.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Seu saldo atual é:" + saldoInicial);
                break;
            case 2:
                double valorReceber = 0;
                System.out.println("Qual valor deseja receber: ");
                valorReceber = leitura.nextDouble();
                break;
        }

    }
}
