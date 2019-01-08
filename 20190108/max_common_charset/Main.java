package max_common_charset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String a = cin.nextLine();
			String b = cin.nextLine();
			ArrayList<Character> c = new ArrayList<>();
			for(int i = 0; i < a.length(); i++) {
				if (c.contains(a.charAt(i))) {
					continue;
				}
				for(int j = 0; j < b.length(); j++) {
					if(b.charAt(j) == a.charAt(i)) {
						c.add(a.charAt(i));
						break;
					}
				}
			}
			if (c.isEmpty()) {
				System.out.println("NULL");
				continue;
			}
			Collections.sort(c);
			for (int i = 0; i < c.size(); i++) {
				System.out.print(c.get(i));
			}
			System.out.println();
		}
	}

}
