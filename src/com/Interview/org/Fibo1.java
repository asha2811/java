package com.Interview.org;

public class Fibo1 { // sum of two preceeding ones
	public static void main(String[]args)
	{
		int f=1;
		int s=1;
		int t;
		int count=5;
	    System.out.println(f);
	    System.out.println(s);
	    for(int i=3;i<=5;i++)
	    {
	    t=f+s;
	    f=s;
	    s=t;
	    System.out.println(t);
	}

}
}
