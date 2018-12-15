package narcissus_num;

public class Main {

	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			int A = i / 100;
			int B = i / 10 % 10;
			int C = i % 10;
			if (i == A * A * A + B * B * B + C * C * C) {
				System.out.println(i);
			}
		}

	}

}
