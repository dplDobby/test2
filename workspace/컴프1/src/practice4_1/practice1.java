package practice4_1;
import java.util.Scanner;

public class practice1 {

	public static void main(String args[])
	{
		int score;
		
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ� : ");
		score = input.nextInt();
		
		if(score>= 90)
		{
			System.out.println("������ A �Դϴ�.");
		}
		else if(score>=80)
		{
			System.out.println("������ B�Դϴ�.");
		}
		else if(score>=70)
		{
			System.out.println("������ C�Դϴ�.");
		}
		else if(score>=60)
		{
			System.out.println("������ D�Դϴ�.");
		}
		else
		{
			System.out.println("������ F�Դϴ�.");
		}
		
	}
}
