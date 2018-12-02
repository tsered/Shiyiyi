package rotate_string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String line = cin.nextLine();
			String[] arr = line.split(" ");
			String str = arr[0];
			int ratate = Integer.valueOf(arr[1]);
			int num = Integer.valueOf(arr[2]) % str.length();
			if (ratate == 0) {
				num = str.length() - num;
			}
			System.out.println(str.substring(num) + str.substring(0, num));
		}
		cin.close();
	}
}
