import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String num = cin.nextLine();
			if (num.equals("END")) {
				break;
			}
			for (int i = 0; i < num.length(); i++) {
				char ch = num.charAt(i);
				if (ch == 'A' || ch == 'w' || ch == 'F') {
					System.out.print('I');
				} else if (ch == 'C') {
					System.out.print('L');
				} else if (ch == 'M') {
					System.out.print('o');
				} else if (ch == 'S') {
					System.out.print('v');
				} else if (ch == 'D' || ch == 'P' || ch == 'G' || ch == 'B') {
					System.out.print('e');
				} else if (ch == 'L') {
					System.out.print('Y');
				} else if (ch == 'X') {
					System.out.print('u');
				} else {
					System.out.print(ch);
				}
			}
		}

	}

}
