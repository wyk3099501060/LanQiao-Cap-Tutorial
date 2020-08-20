package Óï·¨;

import java.util.Scanner;

public class R {
	public static int arr[]=new int[105];
	public static void Init(){
		for(int i=0;i<arr.length;i++){
			arr[i]=i*2;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		Init();
		while(sc.hasNext()){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int out=0;
			for(int i=1;i<n;i++){
				out+=arr[i];
				if(i%m==0){
					System.out.print(out/m+" ");
					out=0;
				}
			}
			out+=arr[n];
			if(n%m==0){
				System.out.println(out/m);
			}else{
				System.out.println(out/(n%m));
			}
		}
	}
}
