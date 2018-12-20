package typewriting;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 建立字典
		Map<String, String> dict = new LinkedHashMap<>();
		String[] lines = {"`1234567890-=", "QWERTYUIOP[]", "ASDFGHJKL;‘\\", "ZXCVBNM,./"};
		for (String line: lines) {
			for (int i = 0; i < line.length(); i++) {
				String letter = line.substring(i, i + 1);
				String beforeLetter = i == 0 ? letter : line.substring(i - 1, i);
				dict.put(letter, beforeLetter);
			}
		}
		dict.put(" ", " ");
		
		// 获取输入，根据字典输出
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String line = cin.nextLine();
			for (int i = 0; i < line.length(); i++) {
				String letter = line.substring(i, i + 1);
				System.out.print(dict.get(letter));
			}
			System.out.println();
		}
		cin.close();
	}

}
