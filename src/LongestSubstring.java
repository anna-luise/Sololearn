import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        
        var words = input.split(" ");

        var substrings = new HashSet<String>();
        String currentSubstring = "";
    
        var letters = words[0].toCharArray();
        for (char letter : letters) { //gehe jeden buchstaben durch
            currentSubstring += letter;
            System.out.println("currentSubstring = " + currentSubstring);
            for (String word : words) {
                if (!word.contains(currentSubstring)) {
                    currentSubstring = "";
                    currentSubstring += letter;
                    break;
                }
            }
            substrings.add(currentSubstring);
        }

        System.out.println(substrings.stream().max(Comparator.comparingInt(String::length)).get());
    
    }
}
