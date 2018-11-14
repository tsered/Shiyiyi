package draw_portiere;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String line = cin.nextLine();
			String[] arr = line.split(" ");
			char c = arr[0].charAt(0);
			int m = Integer.valueOf(arr[1]);
			int n = Integer.valueOf(arr[2]);
			
			for (int i = 0; i < n; i++) {
				for (int j = 1; j < 30; j++) {
					System.out.print(j % 2 == 1 ? c : " ");
				}
				System.out.println();
			}
			for (int k = n; k < m; k++) {
				for (int j = 1; j < 30; j++) {
					System.out.print(j % 4 == 1 ? c : " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		cin.close();
	}
}
