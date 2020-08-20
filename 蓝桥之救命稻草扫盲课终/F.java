package Óï·¨;

import java.util.Scanner;

public class F {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double n=sc.nextDouble();
			int m=sc.nextInt();
			double arr[]=new double [m];
			arr[0]=n;
			double ans=n;
			for(int i=1;i<m;i++){
				arr[i]=Math.sqrt(arr[i-1]);
				ans+=arr[i];
			}
			System.out.println(String.format("%.2f", ans));
		}
	}
}
