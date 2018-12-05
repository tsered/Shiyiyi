package reduce_weight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt(); // 有T组测试数据。
		while (T-- > 0) {
			int N = cin.nextInt(); // 有N个同学
			Integer[] arr = new Integer[N];
			for (int i = 0; i < N; i++) {
				// Di表示第i个同学减肥的天数，Wi表示第i个同学原先的体重（Wi − Di>0）。
				int D = cin.nextInt();
				int W = cin.nextInt();
				arr[i] = W - D;
			}
			Arrays.sort(arr);
			
			// 输出arr
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
				if (i != arr.length - 1) {
					System.out.print(" ");
				} else {
					System.out.println();
				}
			}
		}
	}

}
