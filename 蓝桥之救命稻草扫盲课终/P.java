package Óï·¨;

import java.util.HashSet;
import java.util.Scanner;

public class P {
	public static int check(int x){
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(1);
		for(int i=2;i<=Math.sqrt(x);i++){
			if(x%i==0){
				set.add(i);
				set.add(x/i);
			}
		}
		int ans=0;
		for(int t:set){
			ans+=t;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int m=sc.nextInt();
		for(int t=0;t<m;t++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(check(a)==b&&check(b)==a){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
