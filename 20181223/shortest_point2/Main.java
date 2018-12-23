package shortest_point2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			int N = cin.nextInt();
			if (N == 0) {
				break;
			}
			// 1 读取点，存入Point类型的数组中
			Point[] points = new Point[N];
			for (int i = 0; i < N; i++) {
				int x = cin.nextInt();
				int y = cin.nextInt();
				Point point = new Point(x, y);
				points[i] = point;
			}
			
			// 2 每两个间的距离
			int min = Integer.MAX_VALUE;
			Point minP1 = null;
			Point minP2 = null;
			for (int i = 0; i < points.length - 1; i++) {
				for (int j = i + 1; j < points.length; j++) {
					Point p1 = points[i];
					Point p2 = points[j];
					int a = (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y);
					if (a < min) {
						min = a;
						minP1 = p1;
						minP2 = p2;
					}
				}
			}
			
			// 3 输出minP1和minP2
			System.out.printf("(%d,%d) (%d,%d)\n", minP1.x, minP1.y, minP2.x, minP2.y);
		}
	}
	
	// 这个类表示一个点
	private static class Point {
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
