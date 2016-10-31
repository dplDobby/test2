package practice4_1;

public class Star {
	public static void main(String args[])	{
		for(int i =0;i<10;i++)
		{
			for(int j=0;j<=i &&i<5 ;j++)
			{
				System.out.print("*");
			}
			for(int k=0;k+i<9 && i>=5;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
}
	

