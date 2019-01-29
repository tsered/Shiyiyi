package big_big_big;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String num = cin.nextLine();
			
			// 字符串转列表
			List<Character> list = new ArrayList<>();
			for (int i = 0; i < num.length(); i++) {
				list.add(num.charAt(i));
			}
			
			// 排序，倒序
			list.sort(new Comparator<Character>() {
				@Override
				public int compare(Character o1, Character o2) {
					return o2.compareTo(o1);
				}
			});
			
			// 输出
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
		}

	}

}
