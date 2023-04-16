package arya;

import java.util.Scanner;

public class Isocalespattern 
{     public static void main(String[] args) 
	  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j,k,value,l=0;
		for(i=0;i<n;i++) 
		{
			for(k=n-1;k>i;k--) 
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) 
			{   System.out.print(j+1);
			 
				if(j>l) 
				{   l++;
				   for(value=i,j=0;j<i;j++) 
				   { System.out.print(value);
					    value--;
				   }					
				}
			}
			System.out.println();
		 }
	    }    
}


