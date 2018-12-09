package factorial_parity;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			int N = cin.nextInt();
			if (N == 0) {
				break;
			}
			System.out.println(N % 3 == 0 ?  "EVEN" : "ODD");
		}
		cin.close();
	}

}
