package max_remainder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] countMod = new int[100];
		while(cin.hasNextInt()) {
			int num = cin.nextInt();
			countMod[num % 100]++; 
		}
//		int maxIndex = 0;
//		int maxCount = 0;
//		for (int i = 0; i < countMod.length; i++) {
//			if (countMod[i] > maxCount) {
//				maxCount = countMod[i];
//				maxIndex = i;
//			}
//		}
//		System.out.println(maxIndex);
		System.out.println(getIndexOfMaxValue(countMod));
	}
	
	public static int getIndexOfMaxValue(int[] arr) {
		int maxIndex = 0;
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxCount) {
				maxCount = arr[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

}
