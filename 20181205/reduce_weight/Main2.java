package reduce_weight;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt(); // 有T组测试数据。
		while (T-- > 0) {
			int N = cin.nextInt(); // 有N个同学
			int[] arr = new int[N];
			while (N-- > 0) {
				// Di表示第i个同学减肥的天数，Wi表示第i个同学原先的体重（Wi − Di>0）
				int D = cin.nextInt();
				int W = cin.nextInt();
				int num = W - D;
				// 如何将num从小到大放入arr
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == 0 || num < arr[i]) {
						if (arr[i] > 0) {
							// 插入num时，需要将数组元素向右移
							for (int j = arr.length - 1; j > i; j--) {
								if (arr[j - 1] > 0) {
									arr[j] = arr[j - 1];
								}
							}
						}
						arr[i] = num;
						break;
					}
				}
			}
			
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
