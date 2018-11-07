import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String num = cin.nextLine();
			for (int i = 0; i < num.length(); i++) {
				char ch = num.charAt(i);
				if(ch >= 'A' && ch<='Z') {
					System.out.print((char) (ch + 32));
				} else if(ch >= 'a' && ch<='z') {
					System.out.print((char)(ch - 32));
				} else {
					System.out.print(ch);
				}
			}
			System.out.println();
		}
	}
}
