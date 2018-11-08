import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String num = cin.nextLine();
			if (num.equals("END")) {
				break;
			}
			for (int i = 0; i < num.length(); i++) {
				char ch = num.charAt(i);
				switch (ch) {
				case 'A':
				case 'w':
				case 'F':
					System.out.print('I');
					break;
				case 'C':
					System.out.print('L');
					break;
				case 'M':
					System.out.print('o');
					break;
				case 'S':
					System.out.print('v');
					break;
				case 'D':
				case 'P':
				case 'G':
				case 'B':
					System.out.print('e');
					break;
				case 'L':
					System.out.print('Y');
					break;
				case 'X':
					System.out.print('u');
					break;
				default:
					System.out.print(ch);
				}
			}
		}
	}

}
