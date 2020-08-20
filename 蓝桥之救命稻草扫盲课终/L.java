package Óï·¨;

import java.util.Arrays;
import java.util.Scanner;

public class L{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		for(int t=0;t<m;t++){
			double arr[]=new double[3];
			for(int i=0;i<3;i++){
				arr[i]=sc.nextDouble();
			}
			Arrays.sort(arr);
			System.out.println(arr[0]+arr[1]>arr[2]?"YES":"NO");
		}
	}
}
