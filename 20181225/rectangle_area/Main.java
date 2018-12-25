package rectangle_area;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		while (cin.hasNextInt()) {
			int x1 = cin.nextInt();
			int y1 = cin.nextInt();
			int x2 = cin.nextInt();
			int y2 = cin.nextInt();
			nums.add(Math.abs((x1 - x2)) * Math.abs((y1 - y2)));
		}
		Collections.sort(nums);
		for (int num : nums) {
			System.out.println(num);
		}
	}

}
