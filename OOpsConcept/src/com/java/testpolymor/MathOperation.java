package com.java.testpolymor;

public class MathOperation {

	public void add()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
	public void add(int x)
	{
		int b,c;
		b=10;
		c=x+b;
		System.out.println(c);
	}
	public void add(int x,int y)
	{
		int c;
		c=x+y;
		System.out.println(c);
	}
}
