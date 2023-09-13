package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your startAmount");
		int startAmount = scan.nextInt();
		System.out.println("Enter your winChance");
		double winChance = scan.nextDouble();
		System.out.println("Enter your winLimit");
		int winLimit = scan.nextInt();
		System.out.println("Enter your days");
		int days = scan.nextInt();
		double exp;
		double a = (1-winChance)/(winChance);
		if (winChance == 0.5)
		{
			exp = 1 - (double)(startAmount/winLimit);
		} else
		{
			exp = (Math.pow(a,startAmount)-Math.pow(a, winLimit))/(1-Math.pow(a, winLimit));
		}
		
		
		int totalSimulations = 0;
		for ( int y = 0; y < days; y++)
		{
		int amount = startAmount;
		while(amount<winLimit && amount>0)
		{
			double num = Math.random();
			if (num < winChance)
			{
				amount++;
				System.out.println(amount);
				totalSimulations ++;
			}
			else {
				amount--;
				totalSimulations ++;
				System.out.println(amount);
			}
			
			
		}
		if (amount>=winLimit)
		{
			System.out.println("you win");
		} else if (amount == 0)
		{
			System.out.println("you lose");
		}
		}
		
		
		System.out.println(totalSimulations);
        System.out.println(exp);
	}

}
