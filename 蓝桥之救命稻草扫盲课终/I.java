package Óï·¨;

import java.util.Scanner;

public class I {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int t=0;t<n;t++){
			char c[]=sc.next().toCharArray();
			for(int i=0;i<c.length;i++){
				if(c[i]!=c[c.length-1-i]){
					System.out.println("no");
					break;
				}else if(i>c.length-1-i){
					System.out.println("yes");
					break;
				}
			}
		}
	}
}
