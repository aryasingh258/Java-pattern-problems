package ABD;

public class P8_P9 
{

	public static void main(String[] args) 
	{
//PATTERN 8:
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 			
		
	 int num=1;	
     for(int i=0;i<5;i++)
     {
    	 for(int j=0;j<=i;j++)
    	 {
    		 System.out.print(num+" ");
    		 num++;
    	 }System.out.println();
     }
//     PATTERN 9:
//     1 
//     0 1 
//     1 0 1 
//     0 1 0 1 
//     1 0 1 0 1 
     for(int i=0;i<5;i++)
     {
    	 for(int j=0;j<=i;j++)
    	 {
    		if((i+j)%2==0)
    		{
    			System.out.print(1+" ");
    		}
    		else {
    			System.out.print(0+" ");
    		}
    	 }System.out.println();
     }     
	}

}
