package ABD;
import java.util.Scanner;
public class Advancep1_p2 
{

	public static void main(String[] args) 
	{ 
//	PATTERN ADVANCE 1:
//		**    **
//		***  ***
//		********
//		********
//		***  ***
//		**    **
//		*      *
	Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
	int a=n+1;
	  for(int i=1;i<=2*n;i++)
	  {
		 if(i<=n)
		 {
			 for(int j=1;j<=i;j++)
			  {
				  System.out.print("*");
			  }
			  for(int k=(2*n)-(2*i);k>=1;k--)
			  {
				  System.out.print(" ");
			  }
			  for(int j=1;j<=i;j++)
			  {
				  System.out.print("*");
			  }System.out.println();
		 }
		 else 
		 {   
			 for(int j=n;j>=(i-n);j--)
			  {
				  System.out.print("*");
			  }
			  for(int k=1;k<=(i-a);k++)
			  {
				  System.out.print(" ");
			  }
			  a--;
			  for(int j=n;j>=(i-n);j--)
			  {
				  System.out.print("*");
			  }System.out.println(); 
		 }
		  
	  }

//	  PATTERN ADVANCE 2;
//	     *****
//	    *****
//	   *****
//	  *****
//	 *****
	  int b=sc.nextInt();
	  for(int i=1;i<=b;i++)
	  {
		  for(int k=b-i;k>=1;k--)
		  {
			  System.out.print(" ");
		  }
		  for(int j=b;j>=1;j--)
		  {
			  System.out.print("*");
		  }System.out.println();
	  }
	}

}
