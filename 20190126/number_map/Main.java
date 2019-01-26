package number_map;

import java.util.Scanner;

public class Main {

	// 0，1，2，3，4，5，6，7，8，9
	// 7，3，0，9，1，2，8，6，5，4
	static int[] dict = {2,4,5,1,9,8,7,0,6,3};

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = aboToHuman(cin.nextLine());
		while (n-- > 0) {
			System.out.println(aboToHuman(cin.nextLine()));
		}
		cin.close();
	}
	
	/**
	 * aborigines 土著居民
	 */
	public static int aboToHuman(String abo) {
		int human = 0;
		for (int i = 0; i < abo.length(); i++) {
			int a = abo.charAt(i) - '0';
			human = 10 * human + dict[a];
		}
		return human;
	}
}
