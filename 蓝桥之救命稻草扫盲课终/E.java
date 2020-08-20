package Óï·¨;

import java.util.Arrays;
import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			char c[]=sc.next().toCharArray();
			Arrays.sort(c);
			for(int i=0;i<3;i++){
				if(i==2)
					System.out.println(c[i]);
				else
					System.out.print(c[i]+" ");
			}
		}
	}
}
