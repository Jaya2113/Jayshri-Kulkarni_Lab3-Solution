// Q1. Write a program of Balancing Brackets,use a suitable data structure to print whether the string entered is a
//Balanced Brackets or unbalanced String

package com.greatlearning.BtreeBST;
import java.util.Deque;
import java.util.ArrayDeque;

public class BalancedBracket {
	//method to check if  brackets are balanced or not
	public static boolean areBracketsBalanced(String expression)
	{
		Deque<Character> stack=new ArrayDeque<Character>();
		
		//Traversing for the expression
		for(int i=0;i< expression.length();i++)
		{
			char x=expression.charAt(i);
			if(x=='('|| x=='['|| x=='{')
			{
			//push the element in the stack
			stack.push(x);
			continue;
			}
		
		if(stack.isEmpty())
			return false;
		char check;
		switch(x)
		{
		case ')':
			check=stack.pop();
			if(check=='{'|| check=='[')
				return false;
			break;
		case '}':
			check=stack.pop();
			if(check=='('||check=='[')
				return false;
			break;
		case ']':
			check=stack.pop();
			if(check=='('||check=='{')
				return false;
			break;
		}
		
	}
	//check Empty Stack
	return (stack.isEmpty());

}
}
