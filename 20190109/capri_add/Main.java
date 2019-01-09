package capri_add;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		while (cin.hasNextInt()) {
			int n = cin.nextInt();
			if (nums.contains(n)) {
				continue;
			}
			String m = n + "";
			if (m.length() % 2 == 1) {
				continue;
			}
			String left = m.substring(0, m.length() / 2);
			String right = m.substring(m.length() / 2, m.length());
			int leftnum = Integer.valueOf(left);
			int rightnum = Integer.valueOf(right);
			if ((leftnum + rightnum) * (leftnum + rightnum) == n) {
				nums.add(n);
			}

		}
		Collections.sort(nums);
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
	}

}
