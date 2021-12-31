package com.greatlearning.main;

import java.util.Stack;

public class BalancedBrackets
{
   private static boolean isBalanced(String s)
	{  Stack stack=new Stack();
		
		
		for(char c:s.toCharArray()) 
		{
		System.out.println(c);
		//check if c is (,{,[
		if(c=='('||c=='{'||c=='[')
		 {
			// push open brackets to stack
			stack.push(c);
		 }
		else
	   {//aside if stack is empty
			if(stack.isEmpty()) 
		    {
				return false;
			}
			//pop from the stack(d)
			char d=(char)stack.pop();
			//check if c is the closing bracket for d
			if(c=='}' && d!='{'||(c==')' && d!='(')||(c==']' && d!='['))
			{
				return false;
		    }  
	   }
		   
		}
       return stack.isEmpty();
	}		
	public static void main(String[]args) 
	{
		
		String bracketsExpression = "{[()]})";
		 if(isBalanced(bracketsExpression)) 
		  {
		 	System.out.println("Balanced");
		  }
		else
		   {
			 System.out.println("Not Balanced");
			
    }
  }
}