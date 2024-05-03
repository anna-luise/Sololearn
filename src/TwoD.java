import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        /*var input = "PXXXX,XXXXX,XXXXX,XXXXX,PXXXX";*/
        ArrayList<String> words = new ArrayList<>(List.of(input.split(",")));
        ArrayList<String> items = new ArrayList<>();
        for (String word : words) {
            if (word.contains("P")){
                items.add(word);
            }
        }
        char[] charArrayFirst = items.get(0).toCharArray();
        char[] charArrayLast = items.get(items.size()-1).toCharArray();
        int first = 0;
        int last = charArrayFirst.length-1;
        for (char letter : charArrayFirst) {
            if (letter != 'P') {
                first++;
            } else {
                break;
            }
        }
        for (int i = charArrayLast.length-1; i>=0; i--) {
            var letter = charArrayLast[i];
            if (letter != 'P') {
                last--;
            } else {
                break;
            }
        }
        int spaces = Math.abs(first-last);
        var row1 = 0;
        var row2 = 0;
        for (int i = 0; i < words.size(); i++) {
            var text = words.get(i);
            if (text.contains("P")) {
                row1 = i;
                break;
            }
        }
        for (int i = words.size()-1; i >=0; i--) {
            var text = words.get(i);
            if (text.contains("P")) {
                row2 = i;
                break;
            }
        }
        System.out.println(spaces + Math.abs(row1-row2));
    }
}
