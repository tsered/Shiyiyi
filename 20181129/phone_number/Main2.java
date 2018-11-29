package phone_number;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int countNiceNum = 0; // 统计出现的靓号
		while (cin.hasNextLine()) {
			String num = cin.nextLine();
			if (isNiceNum(num)) {
				System.out.println(num);
				countNiceNum++;
			}
		}
		System.out.println(countNiceNum);
		cin.close();
	}

	public static boolean isNiceNum(String num) {
		int countFour = 0; // 统计数字4的次数
		int countSixOrEight = 0; // 统计数字6或者8的次数
		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
			if (c == '4') {
				countFour++;
			} else if (c == '6' || c == '8') {
				countSixOrEight++;
			}
		}
		return countFour == 0 && countSixOrEight >= 5;
	}

}
