package com.capgemini.test;

public class Palindrome {

	public static boolean checkPalindrome(int num)
	{
		int refer=num;
		int reverse=0;
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println(reverse);
		if(refer==reverse) return true;
		else return false;
	}
}
