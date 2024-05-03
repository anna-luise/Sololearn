import java.util.Scanner;

public class AvarageLenght {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replaceAll("\\.", "");
        input = input.replaceAll("\\?", "");
        String[] words = input.split(" ");
        double sum = 0;
        for (String word : words) {
            sum += word.length();
        }
        System.out.println((int) Math.round(sum / words.length));
        
        /* 
        var reader = new BufferedReader(new java.io.InputStreamReader(System.in, StandardCharsets.UTF_8), 8192);
        String line;
        try {
             line = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } */
    }
}   
