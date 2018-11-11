import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String line = cin.nextLine();
			if (line.equals("0 0")) {
				break;
			}
			String[] arr = line.split(" ");
			int m = Integer.valueOf(arr[0]);
			int n = Integer.valueOf(arr[1]);
			int count = 0;
			for (int i = 0; i < m; i++) {
				String skys = cin.nextLine();
				for (int j = 0; j < n; j++) {
					if (skys.charAt(j) == '*') {
						count++;
					}
				}
			}
			System.out.println(count);
		}
		cin.close();
	}
}
