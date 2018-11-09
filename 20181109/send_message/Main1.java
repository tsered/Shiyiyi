package send_message;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int timeALL = 0;
		while (cin.hasNextLine()) {
			String num = cin.nextLine();
			int count = 0;
			int time = 0;
			for (int i = 0; i < num.length(); i++) {
				char ch = num.charAt(i);
				if (ch >= 'A' && ch <= 'Z') {
					ch = (char) (ch + 32);
				}
				switch (ch) {
				case 'a':
				case 'd':
				case 'g':
				case 'j':
				case 'm':
				case 'p':
				case 't':
				case 'w':
				case ' ':
					count += 1;
					break;
				case 'b':
				case 'e':
				case 'h':
				case 'k':
				case 'n':
				case 'q':
				case 'u':
				case 'x':
					count += 2;
					break;
				case 'c':
				case 'f':
				case 'i':
				case 'l':
				case 'o':
				case 'r':
				case 'v':
				case 'y':
					count += 3;
					break;
				case 's':
				case 'z':
					count += 4;
					break;
				default:
					count += 2;
				}
			}
			time = count / 2 + 1;
			System.out.println(time);
			timeALL += time;
		}
		System.out.println(timeALL);

	}

}
