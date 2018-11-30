package month_days;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String line = cin.nextLine();
			String[] arr = line.split("\\s+");
			int year = Integer.valueOf(arr[0]);
			int month = Integer.valueOf(arr[1]);
			if (year == 0 && month == 0) {
				break;
			}
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(31);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(30);
				break;
			case 2:
				System.out.println(isLoopYear(year) ? 29 : 28);
				break;
			default:
				System.out.println("ERROR");
			}
		}
		cin.close();
	}

	private static boolean isLoopYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}
