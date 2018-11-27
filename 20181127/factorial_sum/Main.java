package factorial_sum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1 计算好1-20的阶乘，保存到数组里面
		int[] facs = new int[20];
		facs[0] = 1;
		for (int i = 1; i < 20; i++) {
			facs[i] = facs[i - 1] * i;
		}
		
		// 2 获取输入，for循环遍历
		Scanner cin = new Scanner(System.in);
		String line = cin.nextLine();
		String[] arr = line.split(" ");
		for (int i = 0; i < arr.length; i++) {
			// 3 进行累加
			String str = arr[i];
			int N = Integer.valueOf(str);
			int sum = 0;
			for (int j = 1; j <= N; j++) {
				sum += facs[j];
			}
			System.out.println(sum);
		}
	}
}
