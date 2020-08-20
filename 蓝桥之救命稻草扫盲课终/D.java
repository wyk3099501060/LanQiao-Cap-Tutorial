package Óï·¨;

import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double r=sc.nextDouble();
			double ans=3.1415927*r*r*r*4/3;//PI=3.1415927ÊÇ¸ö¿Ó
			System.out.println(String.format("%.3f", ans));
		}
	}
}
//import java.util.Scanner;
//
//public class D {
//public static void main(String[]args) {
//	Scanner sc=new Scanner(System.in);
//	while (sc.hasNext()) {
//		double r =sc.nextDouble();
//		double ans = 3.1415927*r*r*r*4/3;
//		System.out.println(String.format("%3.f", ans));
//		
//	}
//	
//}
//}