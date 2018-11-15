package pascal_triangle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 建立前50行
		int[][] f = new int[100][100];
        f[0][0] = 1;
        for (int n = 0; n < 50; n++) {
            for (int m = 0; m <= n; m++) {
                f[n][m] = m == 0 ? 1 : f[n-1][m-1] + f[n-1][m];
            }
        }
        
        Scanner cin = new Scanner(System.in);
        String line = cin.nextLine();
        String[] arr = line.split(" ");
        for (String str: arr) {
        	int row = Integer.parseInt(str);
        	for (int i = 0; i < row; i++) {
        		// 输出空格
        		for (int j = 0; j < 3 * (row - i - 1); j++) {
        			System.out.print(" ");
        		}
        		for (int j = 0; j <= i; j++) {
        			if (f[i][j] >= 100) {
        				System.out.print(f[i][j]); // 三位数字以上，不补空格
        			} else if (f[i][j] >= 10) { 
        				System.out.print(" " + f[i][j]); // 两位数，前面补1空格
        			} else {
        				System.out.print("  " + f[i][j]); // 一位数，前面补2空格
        			}
        			System.out.print("   ");
        		}
        		System.out.println();
        	}
        	System.out.println();
        }
        cin.close();
	}
}
