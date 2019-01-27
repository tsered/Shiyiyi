package prime_factors;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			int a = cin.nextInt();
			if (a == 0) {
				break;
			}
			System.out.println(isFactorRepeat(a) ? "Yes" : "No");
		}
	}
	
	public static boolean isFactorRepeat(int a) {
		for (int i = 2; i * i <= a; i++) {
			if (a % (i * i) == 0) {
				return true;
			}
		}
		return false;
	}

}
