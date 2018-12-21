package number_classify;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String line = cin.nextLine();
		String[] nums = line.split(" ");
		
		// 两个数组，第一个是统计全部数字分类，第二个是统计每个数字的分类
		int[] classifyAll = new int[10];
		int[] classifyOne = new int[10];
		
		for (String num: nums) {
			// 初始化classifyOne
			for (int i = 0; i < classifyOne.length; i++) {
				classifyOne[i] = 0;
			}
			
			// 遍历数字num，统计到 classifyOne
			for (int i = 0; i < num.length(); i++) {
				int a = num.charAt(i) - '0';
				classifyOne[a] = 1;
			}
			
			// 遍历classifyOne，统计到classifyAll
			for (int i = 0; i < classifyOne.length; i++) {
				if (classifyOne[i] == 1) {
					classifyAll[i]++;
				}
			}
		}
		
		// 统计完成，输出classifyAll
		for (int i = 0; i < classifyAll.length; i++) {
			System.out.println(i + ": " + classifyAll[i]);
		}
	}
}