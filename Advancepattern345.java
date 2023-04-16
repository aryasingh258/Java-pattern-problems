package ABD;
import java.util.*;
public class Advancepattern345 {

	public static void main(String[] args) 
	{ Scanner ab =new Scanner(System.in);
//	PATTERN 3:
//		    1 
//		   2 2 
//		  3 3 3 
//		 4 4 4 4 
//		5 5 5 5 5 

		int n=ab.nextInt();
      for(int i=1;i<=n;i++)
      {
    	  for(int j=n-i;j>=1;j--)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int j=1;j<=i;j++)
    	  {
    		  System.out.print(i+" ");
    	  }System.out.println();
      }
//   PATTERN 4:
//       1
//      212
//     32123
//    4321234
//   543212345
      int m=ab.nextInt();
      for(int i=1;i<=m;i++)
      {  
    		  for(int j=m-i;j>=1;j--)
        	  {
        		  System.out.print(" ");
        	  }
        	  for(int j=i;j>=1;j--)
        	  {
        		  System.out.print(j);
        	  }
        	  for(int j=2;j<=i;j++)
        	  {
        		  System.out.print(j);
    	      }System.out.println();    
	 }
//      PATTERN 5:
//       *
//      ***
//     *****
//    *******
//    *******
//     *****
//      ***
//       *
      int a=ab.nextInt();
      for(int i=1;i<=a;i++)
      {
    	  for(int j=a-i;j>=1;j--)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int j=1;j<=2*i-1;j++)
    	  {
    		  System.out.print("*");
    	  }System.out.println();
    	  
      }
      for(int i=a;i>=1;i--)
      {
    	  for(int j=a-i;j>=1;j--)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int j=1;j<=2*i-1;j++)
    	  {
    		  System.out.print("*");
    	  }System.out.println();
      }

}
}
