package divisible_tail;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String line = cin.nextLine();
			if (line.equals("0 0")) {
				break;
			}
			String[] arr = line.split(" ");
			int a = Integer.valueOf(arr[0]);
			int b = Integer.valueOf(arr[1]);
			int c = a * 100;
			boolean isFirstAnswer = true; // 是否第一个答案？
			for (int i = c; i < (c + 100); i++) {
				if (i % b == 0) {
					if (!isFirstAnswer) {
						System.out.print(" ");
					}
					System.out.print(i % 100 < 10 ? "0" + i % 100 : i % 100);
					isFirstAnswer = false;
				}
			}
			System.out.println();
		}

	}

}
