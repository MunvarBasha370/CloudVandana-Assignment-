package javapract;

import java.util.Scanner;

public class RomantoNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toUpperCase();
		long result=0L;
		for(int i=0;i<s.length();i++)
		{
			int cu=getValue(s.charAt(i));
			if(i+1<s.length())
			{
				int next=getValue(s.charAt(i+1));
				if(cu>=next)
					result+=cu;
				else
					result-=cu;
			}
			else
			{
				result+=cu;
			}
		}
		System.out.println(result);
		sc.close();
	}
	public static int getValue(char c)
	{
		if(c=='I')   
			return 1;   
		if(c=='V')   
		    return 5;   
		if (c=='X')   
		    return 10;   
		if (c=='L')   
		    return 50;   
		if (c=='C')   
		    return 100;   
		if (c=='D')   
		    return 500;   
		if (c=='M')   
		    return 1000;   
		return -1;  
	}
}
