package com.nisum.jenkins_demo;

public class Calculator {
	public int sum(int...x)
	{
		int s=0;
		for(int i:x)
		{
			s+=1;
		}
		return s;
	}
	public int square(int x)
	{
		return x*x;
	}
	public int power(int x, int n)
	{
		int res =1;
		for(;n>0;n--)
		{
			res=res*x;
		}
		return res;
	}

}
