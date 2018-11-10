package num_string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String num = cin.nextLine();
			boolean isAllNum = true;
			for (int i = 0; i < num.length(); i++) {
				char ch = num.charAt(i);
				if (ch < '0' || ch > '9') {
					isAllNum = false;
					break;
				}
			}
			System.out.println(isAllNum ? "Yes" : "No");
		}

	}

}
