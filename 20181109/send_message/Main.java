package send_message;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int timeAll = 0;
		while (cin.hasNextLine()) {
			String num = cin.nextLine();
			int count = 0;
			int time = 0;
			for (int i = 0; i < num.length(); i++) {
				char ch = num.charAt(i);
				if (ch >= 'A' && ch <= 'Z') {
					ch = (char) (ch + 32);
				}
				if (ch == 'a' || ch == 'd' || ch == 'g' || ch == 'j' || ch == 'm' || ch == 'p' || ch == 't' || ch == 'w' || ch == ' ') {
					count += 1;
				} else if (ch == 'b' || ch == 'e' || ch == 'h' || ch == 'k' || ch == 'n' || ch == 'q' || ch == 'u' || ch == 'x') {
					count += 2;
				} else if (ch == 'c' || ch == 'f' || ch == 'i' || ch == 'l' || ch == 'o' || ch == 'r' || ch == 'v' || ch == 'y') {
					count += 3;
				} else if (ch == 's' || ch == 'z') {
					count += 4;
				} else {
					count += 2;
				}
			}
			time = count / 2 + 1;
			System.out.println(time);
			timeAll += time;
		}
		System.out.println(timeAll);
	}

}
