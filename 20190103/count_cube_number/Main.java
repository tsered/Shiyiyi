package count_cube_number;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int count = 0;
		while (cin.hasNextInt()) {
			int num = cin.nextInt();
			if (num == 0) {
				break;
			}
			for (int i = 0; i <= num; i++) {
				int cube = i * i * i;
				if (num == cube) {
					count++;
					break;
				}
				if (cube > num) {
					break;
				}
			}
		}
		System.out.print(count);
	}

}
