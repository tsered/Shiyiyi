package prime_sum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextInt()) {
			int num = cin.nextInt();
			boolean isPrime = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				String numStr = num + "";
				int sum = 0;
				for (int i = 0; i < numStr.length(); i++) {
					sum += numStr.charAt(i) - '0';
				}
				System.out.println(sum);
			} else {
				System.out.println(0);
			}

		}
	}

}
