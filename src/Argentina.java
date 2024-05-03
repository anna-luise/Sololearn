import java.util.Scanner;

public class Argentina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pesos = Integer.parseInt(scanner.nextLine());
        int dolares = Integer.parseInt(scanner.nextLine());
        double persoInDolares = pesos * 0.02;
        if (persoInDolares > dolares) {
            System.out.println("Dollars");
        } else {
            System.out.println("Pesos");
        }
    }
}
