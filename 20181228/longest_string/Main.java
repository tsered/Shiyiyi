package longest_string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String line1 = cin.nextLine();
			String line2 = cin.nextLine();
			// 先从line2取第一个字符
			char firstAtLine2 = line2.charAt(0);
			
			// 是否存在line1的后缀 和 line2的前缀相匹配
			boolean isMatch = false;
			
			// 从line1中搜索first
			for (int i = 0; i < line1.length(); i++) {
				if (line1.charAt(i) == firstAtLine2) {
					String suffixInLine1 = line1.substring(i);
					if (suffixInLine1.length() <= line2.length()) {
						String prefixInLine2 = line2.substring(0, suffixInLine1.length());
						if (suffixInLine1.equals(prefixInLine2)) {
							System.out.println(suffixInLine1.length());
							isMatch = true;
							break;
						}
					}
				}
			}
			if (!isMatch) {
				System.out.println(0);
			}
		}
	}

}
