package simple_add;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String line = cin.nextLine();
			String[] arr = line.split("[\\s+()]+");
			int sum = 0;
			for (int i = 1; i <= arr.length - 1; i++) {
				sum += Integer.valueOf(arr[i]);
			}
			System.out.println(sum);
		}
	}

}
