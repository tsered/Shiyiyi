package symmetry_string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		ArrayList<String> symmetrys = new ArrayList<>();
		while(cin.hasNextLine()) {
			String line = cin.nextLine();
			if (isSymmetry(line)) {
				symmetrys.add(line);
			}
		}
		cin.close();
		
		// 按长度排序
		Collections.sort(symmetrys, new Comparator<String>() { 
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					return 0;              
				}
				return o1.length() > o2.length() ? 1 : -1; // 升序
			}
		});
		
		for (String str: symmetrys) {                                  
			System.out.println(str);
		}
	}
	
	// 判断是否对称
	public static boolean isSymmetry(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			int j = str.length() - 1 - i;
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
