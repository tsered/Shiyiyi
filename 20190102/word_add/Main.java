package word_add;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		for (int i = 0; i < words.length; i++) {
			map.put(words[i], i);
		}

		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String line = in.nextLine();
			String[] arr = line.split("[+=]");
			int a = word2int(map, arr[0].trim());
			int b = word2int(map, arr[1].trim());
			if (a == 0 && b == 0) {
				break;
			}
			System.out.println(a + b);
		}
	}

	private static int word2int(Map<String, Integer> map, String word) {
		int num = 0;
		String[] strs = word.split(" ");
		for (String str : strs) {
			num = num * 10 + map.get(str);
		}
		return num;
	}
}
