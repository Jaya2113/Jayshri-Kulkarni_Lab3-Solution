package com.greatlearning.BtreeBST;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		String expression;
		System.out.println("Enter the expression");
		expression=var.nextLine();
		
			//method call
		BalancedBracket balancebracket=new BalancedBracket();
		boolean answer=balancebracket.areBracketsBalanced(expression);
		if(answer)
		
			System.out.println("Brackets are Balanced");
		
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}

}
