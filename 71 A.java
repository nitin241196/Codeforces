
http://codeforces.com/problemset/problem/71/A

import java.util.*;

public class Main{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
	String s=sc.next();
	int len=s.length();
	if(len<=10){
		System.out.println(s);
	}else{
		System.out.println(s.charAt(0)+""+(len-2)+s.charAt(len-1));
	}
}
}
}
