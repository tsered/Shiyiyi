package phone_number;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int countNiceNum = 0; // 统计出现的靓号
		while (cin.hasNextLine()) {
			String num = cin.nextLine();
			int countFour = 0; // 统计数字4的次数
			int countSixOrEight = 0; // 统计数字6或者8的次数
			for (int i = 0; i < num.length(); i++) {
				int n = num.charAt(i) - '0';
				if (n == 4) {
					countFour++;
				} else if (n == 6 || n == 8) {
					countSixOrEight++;
				}
			}
			if (countFour == 0 && countSixOrEight >= 5) {
				System.out.println(num);
				countNiceNum++;
			}
		}
		System.out.println(countNiceNum);
		cin.close();
	}

}
