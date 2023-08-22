import java.util.Scanner;

public class BalancingBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = scanner.nextDouble();
        double depositValue = scanner.nextDouble();
        double withdrawalValue = scanner.nextDouble();


        currentBalance = currentBalance + depositValue - withdrawalValue;

        System.out.println("Updated account balance: " + currentBalance);
    }
}
