package count_pairs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// 计算12!
		int f12 = 1;
		for (int i = 2; i <= 12; i++) {
			f12 *= i;
		}

		// 获取控制台输入，保存到nums数组
		Scanner cin = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		while (cin.hasNextInt()) {
			nums.add(cin.nextInt());
		}
		cin.close();

		// 判断是否整除，如果可以，计算得到的除数是否存在原来的数组里面
		int count = 0;
		for (int i = 0; i < nums.size(); i++) {
			int num = nums.get(i);
			if (f12 % num == 0 && contains(nums, i + 1, f12 / num)) {
				System.out.printf("找到 %d * %d = %d\n", num, (f12 / num), f12);
				count++;
			}
		}
		System.out.println(count);
	}

	// 从下标index开始判断nums数组是否包含num值
	private static boolean contains(ArrayList<Integer> nums, int index, int num) {
		if (index >= nums.size()) {
			return false;
		}
		for (int i = index; i < nums.size(); i++) {
			if (nums.get(i) == num) {
				return true;
			}
		}
		return false;
	}

}
