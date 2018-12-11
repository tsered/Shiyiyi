package date_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		ArrayList<String> strs = new ArrayList<>();
		while (cin.hasNextLine()) {
			String mdy = cin.nextLine();
			String[] splits = mdy.split("/");
			String ymd = splits[2] + "/" + splits[0] + "/" + splits[1];
			strs.add(ymd);
		}
		
		Collections.sort(strs);
		for (String ymd: strs) {
			String[] splits = ymd.split("/");
			String mdy = splits[1] + "/" + splits[2] + "/" + splits[0];
			System.out.println(mdy);
		}
	}

}
