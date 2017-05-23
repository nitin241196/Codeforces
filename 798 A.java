

http://codeforces.com/problemset/problem/798/A


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
	int count=0;
	for(int i=0;i<s.length()/2;i++){
		if(s.charAt(i)!=s.charAt(s.length()-i-1)){
		count++;
	}
	}
	if(count==1 || (count==0 && s.length()%2==1)){
	System.out.print("YES");
	}else{
		System.out.print("NO");

}
}
}
