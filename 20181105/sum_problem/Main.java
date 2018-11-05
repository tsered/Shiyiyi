import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;

        while (cin.hasNextInt()) {
            n = cin.nextInt();

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println(sum);
            System.out.println();
        }
    }
}
