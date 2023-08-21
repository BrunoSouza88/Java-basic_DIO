import java.util.Scanner;

public class contaTerminal {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Por favor, digite o número da Agência: ");
    String agenciaBancaria = scanner.nextLine();

    System.out.print("Por faovr, digite o número da conta bancária: ");
    int contaBancaria = scanner.nextInt();

    scanner.nextLine();

    System.out.print("Por favor, digite o nome do cliente: ");
    String nomeCliente = scanner.nextLine();

    System.out.print("Por favor, digite o saldo: ");
    double saldoCliente = scanner.nextDouble();

    System.out.println("\n Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco");
    System.out.println("Sua agência: " + agenciaBancaria + ", sua conta: " + contaBancaria + " , seu saldo: R$" + saldoCliente + " já estão disponíveis");

    scanner.close();
  }
}