package big_number_add;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String line = cin.nextLine();
			if (line.equals("0")) {
				break;
			}
			String line2 = cin.nextLine();

			// 结果，每次只加一位数字
			String sum = "";

			// 进位辅助变量
			int carry = 0;
			int i = line.length() - 1;
			int j = line2.length() - 1;
			for (; i >= 0 && j >= 0; i--, j--) {
				int a = line.charAt(i) - '0';
				int b = line2.charAt(j) - '0';
				int c = a + b + carry;

				sum = (c % 10) + sum;
				carry = c / 10;
			}
			// 如果第一行没遍历完
			for (; i >= 0; i--) {
				int a = line.charAt(i) - '0';
				int c = a + carry;

				sum = (c % 10) + sum;
				carry = c / 10;
			}
			// 如果第二行没遍历完
			for (; j >= 0; j--) {
				int b = line.charAt(i) - '0';
				int c = b + carry;

				sum = (c % 10) + sum;
				carry = c / 10;
			}

			// 如果还有进位
			if (carry > 0) {
				sum = carry + sum;
			}
			System.out.println(sum);
		}

	}

}
