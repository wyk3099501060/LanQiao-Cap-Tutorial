package 语法;

import java.util.Scanner;

public class  A{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double x1=sc.nextDouble();
			double y1=sc.nextDouble();
			double x2=sc.nextDouble();
			double y2=sc.nextDouble();
			double x=x2-x1;
			double y=y2-y1;
			double d=Math.sqrt(x*x+y*y);
			System.out.println(String.format("%.2f", d));
		}
	}
}
