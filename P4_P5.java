package ABD;

public class P4_P5 
{
//	PATTERN 4:
//	****
//	***
//	**
//	*
	public static void main(String[] args) 
	{
      for(int i=0;i<4;i++)
      {
    	  for(int j=4;j>i;j--)
    	  {
    		  System.out.print('*');
    	  }System.out.println();
      }
//PATTERN 5:     
//       *
//      **
//     ***
//    ****
      
      for(int i=0;i<4;i++)
  	  {
  		for(int j=3;j>i;j--)
  		{
  		  System.out.print(" ");
  		}
    	  
    	for(int j=0;j<=i;j++)
  		{
  			System.out.print("*");
  		}System.out.println();			
  	  }
      
      
	}
}

