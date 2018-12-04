package ascii_table;

public class Main {

	public static void main(String[] args) {
		for (int i = 32; i <= 126; i++) {
			System.out.printf("%5d %s", i, (char) i);
			if (i % 8 == 7)
				System.out.println();
		}
	}
}
