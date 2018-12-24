package buy_chicken;

public class Main2 {

	public static void main(String[] args) {
		// 大鸡三块钱一只,所以不可能大于33
		// 中鸡两块钱一只，所以不可能大于50
		// 小鸡一块钱三只，所以只能是3的倍数
		for (int i = 0; i <= 33; i++) {
			for (int j = 0; j <= 50; j++) {
				int k = 100 - i - j;
				if (k % 3 == 0 && 3 * i + 2 * j + k / 3 == 100) {
					System.out.println(i + " " + j + " " + k);
				}
			}
		}
	}

}
