package divisible_357;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String line = cin.nextLine();
		String[] arr = line.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			int n = Integer.valueOf(str);
			String result = n + "-->";
			int lengthBefore = result.length();
			if (n % 3 == 0) {
				result = result + "3,";
			}
			if (n % 5 == 0) {
				result = result + "5,";
			}
			if (n % 7 == 0) {
				result = result + "7,";
			}
			// 如果没有被上面任意一个整数，则直接输出拼接NONE，否则去掉最后的逗号再输出
			if (lengthBefore == result.length()) {
				System.out.println(result + "NONE");
			} else {
				System.out.println(result.substring(0, result.length() - 1));
			}
		}

	}

}
