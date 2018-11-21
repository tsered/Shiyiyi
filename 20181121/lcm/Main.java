package lcm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String line = cin.nextLine();
		String[] arr = line.split(" ");
		for (int index = 0; index < (arr.length / 2); index++) {
			int n1 = Integer.valueOf(arr[2 * index]);
			int n2 = Integer.valueOf(arr[2 * index + 1]);
			int n = n1 > n2 ? n1 : n2;
			for (int i = n; i <= (n1 * n2); i++) {
				if (i % n1 == 0 && i % n2 == 0) {
					System.out.println(i);
					break;
				}
			}
		}
	}

}
