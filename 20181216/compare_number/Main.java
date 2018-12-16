package compare_number;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String line = cin.nextLine();
			String[] arr = line.split(" ");
			if (arr[0].length() != arr[1].length()) {
				System.out.println(arr[0].length() < arr[1].length() ? arr[0] : arr[1]);
				continue;
			}
			int sub = sum(arr[0]) - sum(arr[1]);
			System.out.println(sub == 0 ? "the same" : (sub < 0 ? arr[0] : arr[1]));
		}
	}

	// 求字符串各个字符的和
	public static int sum(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		return sum;
	}
}
