package practice4_1;

public class practice2 {

	public static void main(String args[])	{
	
	
	int total=0;
		for(int i=1;i<=100;i++)
		{
			System.out.print(i);
			total+=i;
			if(i<100)
				System.out.print("+");
		}
		System.out.println();
		System.out.println("total is " + total);
		
	}
}
