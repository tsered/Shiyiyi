package count_pairs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 计算12!
		int[] f = new int[13];
		f[1] = 1;
		for (int i = 2; i <= 12; i++) {
			f[i] = f[i - 1] * i;
		}
		
		// 获取控制台输入，保存到nums数组
		Scanner cin = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		while (cin.hasNextInt()) {
			int num = cin.nextInt();
			nums.add(num);
		}
		cin.close();
		
		// 进行两两相乘，检查并统计是否与12!相等
		int count = 0;
		int m = 0;
		for (int i = 0; i < nums.size() - 1; i++) {
			for (int j = i + 1; j < nums.size(); j++) {
				m = nums.get(i) * nums.get(j);
				if (m == f[12]) {
					count += 1;
				}
			}
		}
		System.out.println(count);
	}

}
