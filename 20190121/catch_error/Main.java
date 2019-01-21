package catch_error;

import java.util.Objects;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			String line = cin.nextLine();
			if (Objects.equals(line, "#")) {
				break;
			}
			System.out.println(isRight(line) ? "OK" : "suspicious");
		}
	}

	private static boolean isRight(String line) {
		for (int i = 0; i < line.length() - 1; i++) {
			char curr = line.charAt(i);
			char next = line.charAt(i + 1);
			// 1、含有两个连续的大写字母。
			if (isUpper(curr) && isUpper(next)) {
//				System.out.println("连续大写字母:" + curr + "" + next);
				return false;
			}
			// 2、含有一个数字与一个字母相邻。 
			if (isNumber(curr) && isLetter(next)) {
//				System.out.println("数字+字母:" + curr + "" + next);
				return false;
			}
			if (isLetter(curr) && isNumber(next)) {
				System.out.println("字母+数字:" + curr + "" + next);
				return false;
			}
			
			// 3、除了a、I、A这三个字符外，含有一个孤立的字符。（一个字符前后都是空格就算孤立） 
			if (i > 0 && "aIA".indexOf(curr) == -1) {
				char pre = line.charAt(i - 1);
				if (pre == ' ' && curr != ' ' && next == ' ') {
//					System.out.println("孤立字符:" + pre + "" + curr + "" + next);
					return false;
				}
			}
			// 4、含有两个连续的标点符号，如果其中有一个是双引号则例外。
			if (isSymbol(curr) && isSymbol(next) && curr != '"' && next != '"') {
//				System.out.println("连续标点符号:" + curr + "" + next);
				return false;
			}
		}
		return true;
	}


	private static boolean isUpper(char c) {
		return c >= 'A' && c <= 'Z';
	}
	
	private static boolean isLower(char c) {
		return c >= 'a' && c <= 'z';
	}
	
	private static boolean isNumber(char c) {
		return c >= '0' && c <= '9';
	}
	
	private static boolean isSymbol(char c) {
		if (c >= '!' && c <= '/') {
			return true;
		}
		if (c >= ':' && c <= '@') {
			return true;
		}
		if (c >= '[' && c <= '`') {
			return true;
		}
		if (c >= '{' && c <= '~') {
			return true;
		}
		return false;
	}
	
	private static boolean isLetter(char c) {
		return isUpper(c) || isLower(c);
	}

}
