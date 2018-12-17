package file_sort;

import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List<String> dirs = new ArrayList<>();
		List<String> files = new ArrayList<>();
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String line = cin.nextLine();
			if (line.endsWith("Dir")) {
				dirs.add(line);
			} else {
				files.add(line);
			}
		}
		Collections.sort(dirs);
		Collections.sort(files);

		for (String dir: dirs) {
			System.out.println(dir);
		}
		for (String file: files) {
			System.out.println(file);
		}
	}
}