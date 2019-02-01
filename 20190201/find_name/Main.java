package find_name;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    int n = Integer.parseInt(cin.nextLine());
    while (n-- > 0) {
      String line = cin.nextLine();
      String name = cin.nextLine();
      int point = 0;
      int count = 0;
      // System.out.println("line=" + line);
      // System.out.println("name=" + name);
      // point 负责遍历 line 字符串
      while (point < line.length()) {
        boolean isAllEqual = true;
        for (int i = 0; i < name.length(); i++) {
	  if (point >= line.length() || line.charAt(point) != name.charAt(i)) {
	    isAllEqual = false;
	    point++;
            break;
	  }
	  point++;
	}
	// 如果 isAllEqual 是true 说明找到一个name了
	if (isAllEqual) {
	  count++;
	  // System.out.println("find name: '" + line + "'[" + (point-name.length()) + "," + point + "]=" + name);
	}
      }
      System.out.println(count);
    }
  }
}
