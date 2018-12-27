package award_candy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner cin = new Scanner(System.in);
		 while(cin.hasNextInt()) {
			 int a1 = cin.nextInt();
			 int b1 = cin.nextInt();
			 int a2 = cin.nextInt();
			 int b2 = cin.nextInt();
			 for (int i = b1; i < Integer.MAX_VALUE; i+=a1) {
				 if(i % a2 == b2) {
					 System.out.println(i);
					 break;
				 }
			 }
		 }
		 

	}

}
