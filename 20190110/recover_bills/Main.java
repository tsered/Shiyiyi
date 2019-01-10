package recover_bills;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		ArrayList<Integer> nums = new ArrayList<>();
		for(int i = 10047; i <= 19947; i += 100) {
			if (i % 57 == 0 || i % 67 == 0) {
				nums.add(i);
				count++;
			}
		}
		for(int i = 0; i < nums.size(); i++) {
			System.out.println("NO." + nums.get(i));
		}
		System.out.println(count);
	}

}
