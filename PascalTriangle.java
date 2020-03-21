package com.sample;

public class PascalTriangle {
	public static void main(String[] args) {
		int c=1,r=7;
		for(int i=0;i<r;System.out.println("\n"),i++)
		{
			for(int k=1;k<=r-i;k++) //spaces
				System.out.print("   ");
			for(int j=0;j<=i;j++)
			{
				if(j==0 || j==i || i==0 ||i==1)
					c=1;
				else
					c=c*(i-j+1)/j;//logic
					System.out.print("    "+c);
			}
		}
	}

}
