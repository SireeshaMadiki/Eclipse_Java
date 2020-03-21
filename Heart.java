package com.sample;

public class Heart {
	public static void main(String[] args) {
		int i = 0, j = 0;
		for (i = 0; i <= 5; System.out.println(" "), i++) {
			for (j = 0; j <= 6; j++) {
				if (i == 0)
					if (j % 3 != 0)
						System.out.print("* ");
					else
						System.out.print("  ");
				else if (i == 1)
					if (j % 3 == 0)
						System.out.print("* ");
					else
						System.out.print("  ");
				else {
					if (i - j == 2 || i + j == 8)
						System.out.print("* ");
					else
						System.out.print("  ");
				}

			}
		}
	}

}
