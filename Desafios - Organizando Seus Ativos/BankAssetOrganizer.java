import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BankAssetOrganizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> assets = new ArrayList<>();

        int numberOfAssets = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfAssets; i++) {
            String assetCode = scanner.nextLine();
            assets.add(assetCode);
        }

        Collections.sort(assets);

        for (String asset : assets) {
            System.out.println(asset);
        }
    }
}
