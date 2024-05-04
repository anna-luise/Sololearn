import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PokerHand {

    private static final int LAST_INDEX = 4;
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] words = input.split(" ");
        ArrayList<String> values = new ArrayList<>();
        var suites = new ArrayList<String>();
        String res;
        for (String word : words) {
            suites.add(String.valueOf(word.charAt(word.length()-1)));
            values.add(word.substring(0, word.length()-1));
        }
        3,
        for (String value : values) {
            switch (value){
                case "J": values.set(values.indexOf(value), "11"); break;
                case "Q": values.set(values.indexOf(value), "12"); break;
                case "K": values.set(values.indexOf(value), "13"); break;
                case "A": values.set(values.indexOf(value), "14"); break;
                default: break;
            }
        }
        values.sort(Comparator.naturalOrder());

        if (royalFlush(values, suites)) {
            res = "royal flush";
        }
        else if (straightFlush(values, suites)) {
            res = "straight flush";
        }
        else if (fourOfAKind(values)) {
            res = "four of a kind";
        }
        else if (fullHouse(values)) {
            res = "full house";
        }
        else if (flush(suites)) {
            res = "flush";
        }
        else if (straight(values)) {
            res = "straight";
        }
        else if (threeOfAKind(values)) {
            res = "three of a kind";
        }
        else if (twoPair(values)) {
            res = "two pair";
        }
        else if (onePair(values)) {
            res = "one pair";
        }
        else {
            res = "high card";
        }
        System.out.println(res);
        
    }
    public static boolean royalFlush(ArrayList<String> values, ArrayList<String> suites) {
        return straightFlush(values,suites)&& values.get(LAST_INDEX).equals("14");
    }
    public static boolean straightFlush(ArrayList<String> values, ArrayList<String> suites) {
        return straight(values) && flush(suites);
    }
    public static boolean fourOfAKind(ArrayList<String> values) {
       return pair(values) == 6;
    }
    public static boolean fullHouse(ArrayList<String> values) {
        return(pair(values) == 4 );
    }
    public static boolean flush(ArrayList<String> suites) {
        return  pair(suites) == 10;
    }
    public static boolean straight(ArrayList<String> values) {
        for (int i = 0; i < values.size()-1; i++) {
            if (Integer.parseInt(values.get(i)) + 1 != Integer.parseInt(values.get(i + 1))) {
                return false;
            }
        }
        return(true);
    }
    public static boolean threeOfAKind(ArrayList<String> values) {
        return(pair(values) == 3);
    }
    public static boolean twoPair(ArrayList<String> values) {
        return(pair(values) == 2);
    }
    public static boolean onePair(ArrayList<String> values) {
        return(pair(values) == 1);
    }
    public static int pair(ArrayList<String> values) {
        int count = 0;
        for (int i = 0; i < values.size(); i++) {
            for (int j = 0; j < values.size(); j++) {
                if (values.get(i).equals(values.get(j)) && i < j) {
                    count++;
                }
            }
        }
        return(count);
    }
}
     
/*  royal flush irgendwo 10, J, Q, K, A
    Straight flush: a = b+/-1, b = c+/-1, c = d+/-1, d = e+/-1 && same suits
    Four of a kind: 4 same values
    Full house: 3 same values, 2 same values
    Flush: 5 same suits
    Straight: a = b+/-1, b = c+/-1, c = d+/-1, d = e+/-1
    Three of a kind: 3 same values
    Two pair: 2 same values, 2 same values
    One pair: 2 same values
 */
