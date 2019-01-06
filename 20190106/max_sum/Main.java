package max_sum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int[] A = new int[N];
		int MaxSum = 0;
		for (int i = 0; i < N; i++) {
			A[i] = cin.nextInt();
		}
		int left = 0;
		int right = A.length - 1;
		int i = 1;
		while (left < right) {
			if (A[left] < A[right]) {
				MaxSum += A[left] * i;
				i++;
				left++;
			} else {
				MaxSum += A[right] * i;
				i++;
				right--;
			}
		}
		if (left == right) {
			MaxSum += A[left] * i;
		}
		System.out.println(MaxSum);
	}

}
