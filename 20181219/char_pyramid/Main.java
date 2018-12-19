package char_pyramid;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String line = cin.nextLine();
		String[] arr = line.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			int n = Integer.valueOf(str);
			char c = 'A';
			if (n == 0) {
				break;
			}
			for (int j = 0; j < n; j++) {
				// 输出n-j-1个空格
				for (int k = 0; k < n - j - 1; k++) {
					System.out.print(" ");
				}
				// 输出2*j+1个符号
				for (int l = 0; l < 2 * j + 1; l++) {
					System.out.print(c);
				}
				c++;
				System.out.println();
			}
			if (i != arr.length - 1) {
				System.out.println();
			}
		}

	}

}
