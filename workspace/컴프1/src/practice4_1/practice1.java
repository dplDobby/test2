package practice4_1;
import java.util.Scanner;

public class practice1 {

	public static void main(String args[])
	{
		int score;
		
		Scanner input = new Scanner(System.in);
		System.out.println("성적을 입력하시오 : ");
		score = input.nextInt();
		
		if(score>= 90)
		{
			System.out.println("학점은 A 입니다.");
		}
		else if(score>=80)
		{
			System.out.println("학점은 B입니다.");
		}
		else if(score>=70)
		{
			System.out.println("학점은 C입니다.");
		}
		else if(score>=60)
		{
			System.out.println("학점은 D입니다.");
		}
		else
		{
			System.out.println("학점은 F입니다.");
		}
		
	}
}
