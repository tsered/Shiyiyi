package strong_prime;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(Math.pow(2, 16));
		Scanner cin = new Scanner(System.in);
		while(cin.hasNextInt()) {
			int n = cin.nextInt();
			// 如果这个数字不是质数，就输出NO，然后开始获取下一个数字
			if (!isPrime(n)) {
				System.out.println("NO");
				continue;
			}
			int m = sum(n + "");
			if (m > 10) {
				if (!isPrime(m)) {
					System.out.println("NO");
					continue;
				}
				m = sum(m + "");
			}
			System.out.println(isPrime(m) ? "YES" : "NO");
		}
	}
	
	// 求各个位之和
	public static int sum(String num) {
		int s = 0;
		for(int i = 0; i < num.length(); i++) {
			s += num.charAt(i) - '0';
		}
		return s;
	}
	
	// 判断是否素数
	public static boolean isPrime(long n) {
		for (int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
