package ABD;

//PATTERN 2:
//*****
//*   *
//*   *
//*****

public class P2_P3 {
  public static void main(String[] args)
	{
	for(int i=0;i<4;i++)
	{
	 for(int j=0;j<5;j++)
	  {
		  if(i==0 || i==3 || j==0 || j==4)
			 {
			  System.out.print("*");
			 }
			 else
			 {
			   System.out.print(" ");
			 }
	  }
	  System.out.println();	 
	}
	
//	PATTERN 3:  
//	*
//	**
//	***
//	****
	
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print("*");
		}System.out.println();			
	}
	}
}
