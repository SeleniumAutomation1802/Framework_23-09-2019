package com.nbrown.testscenario.JDW;

public class PrimePiramid
{
	public static void main(String[] args)
	{
		int[] arr = new int[25];
		int j=0;
		int n=0;
		for(int i=2; i<=100; i++)
		{
			boolean flag = isPrime(i);
			if(flag)
			{
				arr[j] = i;
				j++;
			}
		}
		
		for(int i=1; i<=5; i++)
		{
			for(int k=i; k<5; k++)
			{
				System.out.print(" ");
			}
			for(int l=1; l<=(i*2)-1; l++)
			{
				System.out.print(arr[n++]+" ");
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
