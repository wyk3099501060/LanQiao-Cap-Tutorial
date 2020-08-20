package Óï·¨;

import java.util.Scanner;

public class J {
	public static boolean isp[]=new boolean [3000];
	public static void Init(){
		for(int i=0;i<3000;i++)isp[i]=true;
		for(int i=2;i<3000;i++){
			for(int j=i*2;j<3000;j+=i){
				isp[j]=false;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Init();
		while(sc.hasNext()){
			int x=sc.nextInt(),y=sc.nextInt();
			if(x==0&&y==0)break;
			boolean All=true;
			for(int i=x;i<=y;i++){
				if(!isp[i*i+i+41])All=false;
			}
			System.out.println(All?"OK":"Sorry");
		}
	}
}
