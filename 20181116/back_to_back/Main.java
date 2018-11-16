package back_to_back;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String line = cin.nextLine();
		String[] arr = line.split(" ");
		for (int index = 0; index < (arr.length / 2); index++) {
			char c = arr[2 * index].charAt(0);
			int n = Integer.valueOf(arr[2 * index + 1]);

			// 总共有n行
			for (int i = 0; i < n; i++) {
				// 1 左边的空格部分 要 n-i-1 个
				for (int j = 0; j < n - i - 1; j++) {
					System.out.print(" ");
				}
				// 2 左边的三角形 i+1 个字符
				for (int k = 0; k < i + 1; k++) {
					System.out.print(c);
				}
				// 3 中间的空格 1 个
				System.out.print(" ");
				// 4 右边的三角形 i+1 个字符
				for (int h = 0; h < i + 1; h++) {
					System.out.print(c);
				}
				System.out.println();
			}
		}

	}

}
