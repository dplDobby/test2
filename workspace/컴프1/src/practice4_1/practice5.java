package practice4_1;
import java.util.Scanner;

public class practice5 {
	public static void main(String args[])
	{
		int num=0;
		Scanner scan = new Scanner(System.in);
		int yack=0;
		
		System.out.println("소수인지 판단합니다.");
		num = scan.nextInt();
		
		for(int i =2;i<num;i++)
		{
			if(num%i == 0 )
			{
				System.out.println("소수가 아닙니다.");
				yack++;
				break;
			}
		}
		if(yack==0)
			System.out.println("소수 입니다.");
	}

}
