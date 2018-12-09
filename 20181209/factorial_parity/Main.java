package factorial_parity;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[10001];
		a[1] = 1;
		a[2] = 1;
		Scanner cin = new Scanner(System.in);
		while (true) {
			int N = cin.nextInt();
			if (N == 0) {
				break;
			}
			for (int i = 3; i <= N; i++) {
				a[i] = a[i - 1] + a[i - 2];
//              System.out.println(i + " ==> " + (a[i]%2==0?"偶":"奇") + a[i]);
			}
			System.out.println(a[N] % 2 == 0 ?  "EVEN" : "ODD");
		}
		cin.close();
	}

}
