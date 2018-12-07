package straight;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextInt()) {
			int n = cin.nextInt();

			// 读取n个数字，放入数组arr
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = cin.nextInt();
			}
			// 排序

			Arrays.sort(arr);

			// 去重 5 5 6 6 7 8 9
			// 加个标记数组，用来记录连对的
			// 牌张点数为1到13之间，所以要有14个
			int[] numPair = new int[14];
			int count = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == arr[i + 1] && arr[i + 1] > 0) {
					for (int j = i + 1; j < arr.length - 1; j++) { // j的范围是 i+1到数组倒数第二个
						arr[j] = arr[j + 1]; // 将数组的j+1个数字向左覆盖
					}
					// 将第arr.length-count -1设置为0，避免最大的数值出现错误的连对
					arr[arr.length - count - 1] = 0;
					count++;
					numPair[arr[i]] = 1; // 加上标记，表示当前数字arr[i]是连对数
				}
			}
			// 去重结果： 5 6 7 8 9 0 0

			// 检查是否顺子
			boolean isStraight = false;
			for (int i = 0; i < arr.length - 4; i++) {
				if (arr[i + 1] == arr[i] + 1 && arr[i + 2] == arr[i + 1] + 1 && arr[i + 3] == arr[i + 2] + 1
						&& arr[i + 4] == arr[i + 3] + 1) {
					// 如果顺子中，重复的牌不多于2张，就打顺子
					int begin = arr[i];
					if (numPair[begin] + numPair[begin + 1] + numPair[begin + 2] + numPair[begin + 3] + numPair[begin + 4] <= 2) {
						isStraight = true;
					}
				}
			}
			System.out.println(isStraight ? "Yes" : "No");
		}
	}

}
