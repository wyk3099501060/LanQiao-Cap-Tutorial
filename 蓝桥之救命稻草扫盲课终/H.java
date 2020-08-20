package Óï·¨;

import java.util.Scanner;

public class H {
	public static double arr[]=new double[1005];
	public static void Init(){
		for(int i=1;i<1005;i++){
			arr[i]=1.0/i;
		}
		for(int i=1;i<1005;i++){
			if(i%2==0){
				arr[i]=arr[i-1]-arr[i];
			}else{
				arr[i]=arr[i-1]+arr[i];
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		Init();
		for(int t=0;t<m;t++){
			int n=sc.nextInt();
			System.out.println(String.format("%.2f", arr[n]));
		}
	}
}
