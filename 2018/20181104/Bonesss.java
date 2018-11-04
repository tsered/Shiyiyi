
public class Bonesss {

	public static void main(String[] args) {
		int yourSales = 500;
		int target = 600;
		String performance = "";
		int bonus = 0;
		{
			if (yourSales >= 2*target)
			{
				performance = "Excellent";
				bonus = 1000;
			}
			else if(yourSales >= 1.5* target)
			{
				performance ="Fine";
				bonus =500;
			}
			else if(yourSales >=target)
			{
				performance ="Satisfactory";
				bonus =0;
			}
			else
			{
				System.out.println("You're fired");
			}
			System.out.println("performance:" + performance);
			System.out.println("bonus:" + bonus);
		}


	}

}
