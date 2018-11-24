package count_num;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String firstLine = cin.nextLine();
		int num = Integer.valueOf(firstLine);
		while (num-- > 0) {
			String line = cin.nextLine();
			int[] arr = new int[10];
			int sum = 0;
			for (int i = 0; i < line.length(); i++) {
				int a = line.charAt(i) - '0';
				arr[a] = arr[a] + 1;
				sum += a;
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					System.out.println(i + ":" + arr[i]);
				}
			}
			System.out.println(sum);
		}

	}

}
