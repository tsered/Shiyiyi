package count_word;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String line = cin.nextLine();

		// 定义一个map来存放单词的出现频率，使用TreeMap按照键的自然顺序排序
		Map<String, Integer> countWordMap = new TreeMap<>();

		// 将输入行按空格符号分割成一个个单词
		String[] words = line.split(" ");

		// 对单词进行统计，注意去掉末尾的标点符号
		for (String word : words) {
			// 检查最后一个字符，如果不是字母，就删掉
			char lastChar = word.charAt(word.length() - 1);
			if (!isLetter(lastChar)) {
				word = word.substring(0, word.length() - 1);
			}
			// 进行统计
			if (countWordMap.containsKey(word)) {
				countWordMap.put(word, countWordMap.get(word) + 1);
			} else {
				countWordMap.put(word, 1);
			}
		}
		// 最后进行输出
		for (Map.Entry<String, Integer> entry : countWordMap.entrySet()) {
			double rate = entry.getValue() * 100.0 / words.length;
			System.out.printf("%15s:%2d %.2f%%\n", entry.getKey(), entry.getValue(), rate);
		}
	}

	/**
	 * 判断字符c是大写字母或者小写字母
	 */
	private static boolean isLetter(char c) {
		return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
	}

}
