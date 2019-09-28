package com.nbrown.testscenario.JDW;

public class PrimePiramid12
{
	public static void main(String[] args)
	{
		int counter = 2; 
		
		for(int i=1; i<=5; i++)
		{
			for(int k=i; k<5; k++)
			{
				System.out.print(" ");
			}
			for(int l=1; l<=(i*2)-1; l++)
			{
				while(!isPrime(counter))
				{
					counter++;
				}
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
			
		}
	}
	
	public static boolean isPrime(int num)
	{
		boolean flag = true;
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				flag=false;
			}
		}
		return flag;
	}
}
