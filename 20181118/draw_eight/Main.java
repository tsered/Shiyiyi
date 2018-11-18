package draw_eight;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String firstLine = cin.nextLine();
		int num = Integer.valueOf(firstLine);
		while (num-- > 0) {
			String line = cin.nextLine();
			String[] arr = line.split(" "); // 分成三个数字
			char c = arr[0].charAt(0);
			int height = Integer.valueOf(arr[1]);
			
			int weight = height % 6 + 1; // 字符宽
			int h2 = (height - 3) / 2; // 第2個高度
			int h4 = height - 3 - h2; // 第4個高度

			outputOneLine(weight, h4, c);
			outputNumLine(h2, weight, h4, c);
			outputOneLine(weight, h4, c);
			outputNumLine(h4, weight, h4, c);
			outputOneLine(weight, h4, c);

			System.out.println();
		}
	}

	public static void outputOneLine(int weight, int h4, char c) {
		for (int j = 0; j < weight; j++) {
			System.out.print(" ");
		}
		for (int k = 0; k < h4; k++) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static void outputNumLine(int num, int weight, int h4, char c) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < weight; j++) {
				System.out.print(c);
			}
			for (int k = 0; k < h4; k++) {
				System.out.print(" ");
			}
			for (int m = 0; m < weight; m++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
