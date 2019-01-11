package stat_pic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1 获取输入，并统计大写字母到数组 arr
		int[] arr = new int[26];
		try (Scanner cin = new Scanner(System.in)) {
			while (cin.hasNextLine()) {
				String line = cin.nextLine();
				for (int i = 0; i < line.length(); i++) {
					char ch = line.charAt(i);
					if (ch >= 'A' && ch <= 'Z') {
						arr[ch - 'A']++;
					}
				}
			}
		}

		// 2 输出统计图，height为图的高度
		int height = 0;
		for (int count : arr) {
			if (count > height) {
				height = count;
			}
		}
		// 倒序
		for (int row = height; row > 0; row--) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] >= row ? '*' : ' ');
				if (i != arr.length - 1) {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print((char) ('A' + i));
			if (i != arr.length - 1) {
				System.out.print(' ');
			}
		}
		System.out.println();
	}

}
