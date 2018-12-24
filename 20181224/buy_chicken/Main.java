package buy_chicken;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				for (int k = 0; k <= 100; k++) {
					if ((3 * i * 3 + 2 * j * 3 + k == 300) && (i + j + k == 100)) {
						System.out.println(i + " " + j + " " + k);
					}
				}
			}
		}
	}

}
