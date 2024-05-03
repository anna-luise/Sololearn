import java.util.ArrayList;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var words = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            words.add(scanner.nextLine());
        }
        boolean check = true;
        var booleanListe = new ArrayList<Boolean>();
        for (String word : words) {
            int i = 0;
            while (i < word.length()) {
                if (word.charAt(i) == word.charAt(word.length()-1 - i)) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
                i++;
            }
            booleanListe.add(check);
        }
        check = false;
        for (boolean a : booleanListe) {
            if (a == true) {
                System.out.println("Open");
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Trash");
        }
    }
}
