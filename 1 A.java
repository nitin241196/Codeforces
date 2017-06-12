http://codeforces.com/problemset/problem/1/A

import java.util.*;

public class Main{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t_c=1;
	for(int i=0;i<t_c;i++){
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a=sc.nextInt();
		double count1=(n*1.0)/a;
		double count2=(m*1.0)/a;
		
		System.out.println((long)(Math.ceil(count1)*Math.ceil(count2)));
			
			}

		}
     }
  
