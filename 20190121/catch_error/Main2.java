package catch_error;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("([A-Z]{2})|([0-9][a-zA-Z])|([a-zA-Z][0-9])|( [^aIA] )|(\\p{P}\\p{P}&[^\"])");
		Scanner cin = new Scanner(System.in);
		while (true) {
			String line = cin.nextLine();
			if (Objects.equals(line, "#")) {
				break;
			}
			Matcher matcher = pattern.matcher(line);
			System.out.println(matcher.find() ? "suspicious" : "OK");
		}
	}
}
