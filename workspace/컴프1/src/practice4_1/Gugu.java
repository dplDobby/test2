package practice4_1;

public class Gugu {
	public static void main(String args[])
	{
		System.out.println("�������� ����մϴ�.");
		
		for(int i=1;i<10;i++)
		{
			for(int j=2;j<10;j++ )
			{
				System.out.format("%d * %d = %3d  ",j,i,j*i);
			}
			System.out.println();
		}
	}

}
