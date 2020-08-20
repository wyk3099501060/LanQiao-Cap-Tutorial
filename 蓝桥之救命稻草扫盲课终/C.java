package Óï·¨;

//import java.util.Scanner;
//
//public class C {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		while(sc.hasNext()){
//			int n=sc.nextInt();
//			int m=sc.nextInt();
//			long x=0,y=0;
//			for(int i=Math.min(n, m);i<=Math.max(n, m);i++){
//				if(i%2==0){
//					x+=i*i;
//				}else{
//					y+=i*i*i;
//				}
//			}
//			System.out.println(x+" "+y);
//		}
//	}
//}

import java.util.Scanner;

public class  C{
	public void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()) {
			int n =sc.nextInt();
			int m =sc.nextInt();
			long x =0,y=0;
			for (int i=Math.min(n, m);i<=Math.max(n, m);i++) {
				if (i%2 == 0) {
					x+=i*i;
				}else {
					y+=i*i*i;
				}
			}
			System.out.println(x+""+y);
		}
	}

}