package 语法;

import java.util.Scanner;

public class Y {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		while(sc.hasNext()){
			int m=sc.nextInt();
			int n=sc.nextInt();
			long arr[][]=new long[m][n];//定义long，否则转绝对值爆int
			long indexx=0,indexy=0,value=0;
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					long x=sc.nextInt();
					if(Math.abs(value)<Math.abs(x)){
						value=x;
						indexx=i;
						indexy=j;
					}
				}
			}
			System.out.println((indexx+1)+" "+(indexy+1)+" "+value);
		}
	}
}
