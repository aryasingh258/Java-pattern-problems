package ABD;

public class P6_P7 
{
	public static void main(String[] args)
	{
//Pattern 6:
//  1 
//  1 2 
//  1 2 3 
//  1 2 3 4 
//  1 2 3 4 5
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}System.out.println();
		}
//Pattern 7:
//	1 2 3 4 5 
//	1 2 3 4 
//	1 2 3 
//	1 2 
//	1 
		for(int i=1;i<=5;i++)
		{
		 for(int j=5;j>=i;j--)
		 {
			 System.out.print((5-j+1)+" ");
		 }System.out.println();
		}
		
		
	}
}
