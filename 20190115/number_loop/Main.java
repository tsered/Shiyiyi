package number_loop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String line = cin.nextLine();
			String[] strs = line.split(" ");
			int n = Integer.parseInt(strs[0]);
			int p = Integer.parseInt(strs[1]);
			
			ArrayList<Integer> nums = new ArrayList<>();
			nums.add(n);
			int index = -1;
			int next = n;
			while (true) {
				next = getNext(next, p);
				index = nums.indexOf(next);
				if (index > 0) {
					break;
				}
				nums.add(next);
			}
			System.out.println(index - 1);
		}

	}

	private static int getNext(int n, int p) {
		int sum = 0;
		int tmp = n;
		while (tmp > 0) {
			sum += Math.pow((tmp % 10), p);
			tmp /= 10;
		}
		return sum;
	}

}
