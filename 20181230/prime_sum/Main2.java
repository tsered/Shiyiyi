package prime_sum;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextInt()) {
			int num = cin.nextInt();
			System.out.println(isPrime(num) ? getSum(num) : 0);
		}
	}

	private static int getSum(int num) {
		String numStr = num + "";
		int sum = 0;
		for (int i = 0; i < numStr.length(); i++) {
			sum += numStr.charAt(i) - '0';
		}
		return sum;
	}

	private static boolean isPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
