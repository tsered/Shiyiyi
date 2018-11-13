package draw_mountain;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String line = cin.nextLine();
			String[] arr = line.split(" ");
			char c = arr[0].charAt(0);
			int n = Integer.valueOf(arr[1]);
			for (int i = 0; i < n; i++) {
				int a = n - i -1;
				int b = 2 * i + 1;
				for (int j = 0;j < a; j++)
					System.out.print(' ');
				for (int k =0; k < b; k++)
					System.out.print(c);
				System.out.println();
			}
		}
		cin.close();
	}

}
