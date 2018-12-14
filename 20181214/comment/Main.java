package comment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String line = cin.nextLine();
			// 进行转换，如果开始是注释，则不输出
			for (int i = 0; i < line.length() - 1; i++) {
				if (line.charAt(i) == '/' && line.charAt(i + 1) == '/') {
					line = i == 0 ? "" : line.substring(0, i);
					break;
				}
			}
			// 如果中间是注释，则取前面的紫川进行输出，否则输出全部
			if (line.length() > 0) {
				System.out.println(line);
			}
		}
		cin.close();
	}

}
