import java.util.Scanner;

public class Argentina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pesos = Integer.valueOf(scanner.nextLine());
        int dolares = Integer.valueOf(scanner.nextLine());
        double persoInDolares = pesos * 0.02;
        if (persoInDolares > dolares) {
            System.out.println("Dollars");
        } else {
            System.out.println("Pesos");
        }
    }
}
