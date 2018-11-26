package factorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNextInt()) {
			int N = cin.nextInt();
			int factorial = 1;

			for (int i = 1; i <= N; i++) {
				factorial = factorial * i;
			}
			System.out.println(factorial);

		}
	}

}
