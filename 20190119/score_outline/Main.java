package score_outline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<>();
		while (cin.hasNextInt()) {
			int n = cin.nextInt();
			if (n == 0) {
				break;
			}
			for (int i = 0; i < n; i++) {
				arrayList.add(cin.nextInt());
			}
		
			Collections.sort(arrayList, new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o2.compareTo(o1);
				}
			});
			
			// 存放到二维数组
			int[][] arr = new int[5][n];
			int col = 0;
			for (int i = 0; i < n; i++) {
				int e = arrayList.get(i);
				int row = 9 - e / 10;
				arr[row][col++] = e;
			}
			
			// 输出
			for (int i = 0; i < 5; i++) {
				System.out.print((char) ('A' + i) + ":");
				for (int j = 0; j < n; j++) {
					if (arr[i][j] > 0) {
						System.out.print(" " + arr[i][j]);
					}
				}
				System.out.println();
			}
		}

	}

}
