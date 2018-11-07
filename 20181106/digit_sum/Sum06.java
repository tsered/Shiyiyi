import java.util.Scanner;

public class Sum06 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextInt()) {
			String num = cin.nextLine();
			int sum = 0;
			for (int i = 0; i < num.length(); i++) {
				char ch = num.charAt(i); // 先转为字符
				int n = ch - '0'; // 根据码点转为整数
				sum += n;
			}
			System.out.println(sum);

		}
	}

}
