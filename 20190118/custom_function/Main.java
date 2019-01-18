package custom_function;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int B = 0;
		while (cin.hasNextInt()) {
			int count = 0;
			int A = cin.nextInt();
			int L = cin.nextInt();
			int R = cin.nextInt();
			for (int i = L; i <= R; i++) {
				if (f(i) * f(i) == f(A * i)) {
					count++;
				}
			}
			B++;
			System.out.println("case " + B + ": " + count);
		}
	}

	public static int f(int x) {
		int s = 0;
		while (x > 0) {
			s += x % 10;
			x /= 10;
		}
		return s;
	}
}
