import java.util.ArrayList;
import java.util.Scanner;

public class ThatsOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        var list = new ArrayList<Integer>();
        for (int i = 0; i < input; i++) {
            list.add(scanner.nextInt());
        }
        scanner.close();
        int sum = 0;
        for (int i : list) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
