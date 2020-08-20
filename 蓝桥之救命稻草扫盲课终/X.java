package Óï·¨;

import java.util.Scanner;

public class X {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)break;
			int ans=0;
			for(int i=0;i<n;i++){
				int x=sc.nextInt();
				ans+=x/100;
				x%=100;
				ans+=x/50;
				x%=50;
				ans+=x/10;
				x%=10;
				ans+=x/5;
				x%=5;
				ans+=x/2;
				x%=2;
				ans+=x;
			}
			System.out.println(ans);
		}
	}
}
