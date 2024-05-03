import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SafetyDepositBoxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String item = scanner.nextLine();
        var wordsAlsListe = new ArrayList<>(List.of(input.split(",")));
        System.out.println((wordsAlsListe.indexOf(item)+1)*5);
    }
}
