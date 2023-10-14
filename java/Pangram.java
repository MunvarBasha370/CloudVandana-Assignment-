package javapract;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=sc.nextLine();
		a=a.replace(" ","");
		a=a.toLowerCase();
		System.out.println(pangrams(a));
		sc.close();
	}
	public static String pangrams(String s) {
        Set<Character> alpha=new HashSet<Character>();
        for(int i=0;i<s.length();++i)
        {
            alpha.add(s.charAt(i));
        }
        if(alpha.size()!=26)
            return "not pangram";
        else
            return "pangram";

    }
}

