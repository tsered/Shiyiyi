package send_message;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// 字母數組
		int[] arr = { 1, 2, 3, // abc
				1, 2, 3, // def
				1, 2, 3, // ghi
				1, 2, 3, // jkl
				1, 2, 3, // mno
				1, 2, 3, 4, // pqrs
				1, 2, 3, // tuv
				1, 2, 3, 4 // wxyz
		};
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
				if (ch >= 'a' && ch <= 'z') {
					count += arr[ch - 'a'];
				} else if (ch == ' ') {
					count += 1;
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
