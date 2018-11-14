package construct_expression;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String firstLine = cin.nextLine();
		int num = Integer.valueOf(firstLine); // 读第一行，下面有num行
		while (num-- > 0) {
			String line = cin.nextLine();
			String[] arr = line.split(" "); // 分成三个数字
			int a = Integer.valueOf(arr[0]);
			int b = Integer.valueOf(arr[1]);
			int c = Integer.valueOf(arr[2]);
			if (a + b == c) {
				System.out.println(a + "+" + b + "=" + c);
			} else if (a - b == c) {
				System.out.println( a + "-" + b + "=" + c);
			} else if (b - a == c) {
				System.out.println(b + "-" + a + "=" + c);
			} else if (a * b == c) {
				System.out.println(a + "*" + b + "=" + c);
			} else if (a / b == c) {
				System.out.println(a + "/" + b + "=" + c);
			} else if (b / a == c) {
				System.out.println(b + "/" + a + "=" + c);
			} else {
				System.out.println("None");
			}
			
		}
	}

}
