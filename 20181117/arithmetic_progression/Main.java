package arithmetic_progression;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String line = cin.nextLine();
		while (!line.equals("0 0 0")) {
			String[] arr = line.split(" ");
			int begin = Integer.valueOf(arr[0]);
			int end = Integer.valueOf(arr[1]);
			int step = Integer.valueOf(arr[2]);
			int sum = 0;
			
			for(int i = begin; i <= end; i+=step) {
				sum += i;
			}
			System.out.println(sum);
			line = cin.nextLine();
		}
	}

}
