package Óï·¨;

import java.util.Scanner;

public class Q {
	public static int arr[]=new int[31];
	public static void Init(){
		arr[0]=3;
		for(int i=1;i<31;i++){
			arr[i]=(arr[i-1]-1)*2;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Init();
		for(int t=0;t<n;t++){
			int a=sc.nextInt();
			System.out.println(arr[a]);
		}
	}
}
