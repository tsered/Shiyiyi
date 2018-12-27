package win_prize;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// set 版本实现
public class Main2 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			// 读取购奖券号码，即猜奖号码行
			String guessNumLine = cin.nextLine();
			if (guessNumLine.equals("0")) {
				break;
			}
			String winNumLine = cin.nextLine();

			// 定义3个ArrayList来保存结果
			Set<String> win1 = new LinkedHashSet<>();
			Set<String> win2 = new LinkedHashSet<>();
			Set<String> win3 = new LinkedHashSet<>();

			// 转为数组形式，用于遍历
			String[] guessNumArr = guessNumLine.split(" ");
			String[] winNumArr = winNumLine.split(" ");
			for (int i = 0; i < winNumArr.length; i++) {
				for (int j = 0; j < guessNumArr.length; j++) {
					if (winNumArr[i].equals(guessNumArr[j])) {
						switch (i) {
						case 0:
							win1.add(winNumArr[i]);
							break;
						case 1:
						case 2:
						case 3:
							win2.add(winNumArr[i]);
							break;
						default:
							win3.add(winNumArr[i]);
						}
					}
				}
			}
			System.out.println("No.1:" + displayArr(win1));
			System.out.println("No.2:" + displayArr(win2));
			System.out.println("No.3:" + displayArr(win3));
		}

	}

	private static String displayArr(Set<String> winList) {
		String result = "";
		for (String str : winList) {
			result += " " + str;
		}
		return result;
	}

}
