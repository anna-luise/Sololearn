import java.util.ArrayList;
import java.util.Scanner;

public class HexCodeGen {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        String input;
        while (!(input = scanner.nextLine()).isEmpty()) {
            numbers.add(Integer.valueOf(input));
        }
        for (int i = 0; i < 3; i++) {
            numbers.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println(hexCode(numbers));
    }

    public static String decimalToHex(int decimal) {
        String hex;
        if (decimal == 0) {
            return ("0");
        } else if (decimal <= 15) {
            return switch (decimal) {
                case 10 -> "a";
                case 11 -> "b";
                case 12 -> "c";
                case 13 -> "d";
                case 14 -> "e";
                case 15 -> "f";
                default -> String.valueOf(decimal);
            };
        } else {
            hex = decimalToHex((decimal - (decimal % 16)) / 16) + decimalToHex(decimal % 16);
        }
        return hex;
    }

    public static String hexCode(ArrayList<Integer> numbers) {
        String hex = "#";
        for (int i : numbers) {
            hex += (decimalToHex(i));
        }
        return hex;
    }
}
