package judge_triangle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String firstline = cin.nextLine();
		int N = Integer.valueOf(firstline);
		while (N-- > 0) {
			String line = cin.nextLine();
			String[] arr = line.split(" ");
			int Ai = Integer.valueOf(arr[0]);
			int Bi = Integer.valueOf(arr[1]);
			int Ci = Integer.valueOf(arr[2]);
			
			// 找出最大的边，我们假设Ai是最大的
			// 如果Bi大于Ai，则进行交换，这样Ai就是较大值
			if (Bi > Ai) {
				int t = Ai;
				Ai = Bi;
				Bi = t;
			}
			// 如果Ci大于Ai，则进行交换，这样Ai就是较大值
			if (Ci > Ai) {
				int t = Ai;
				Ai = Ci;
				Ci = t;
			}
			
			// 如果两条小边Bi、Ci之和大于Ai，那么就是三角形
			System.out.println(Bi + Ci > Ai ? "YES" : "NO");
		}
	}

}
