package Óï·¨;

import java.util.*;

public class G {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int t=0;t<n;t++){
			String s=sc.nextLine();
			int ans[]=new int[5];
			char c[]=s.toCharArray();
			for(int i=0;i<s.length();i++){
				if(c[i]=='a'){
					ans[0]++;
				}else if(c[i]=='e'){
					ans[1]++;
				}else if(c[i]=='i'){
					ans[2]++;
				}else if(c[i]=='o'){
					ans[3]++;
				}else if(c[i]=='u'){
					ans[4]++;
				}
			}
			System.out.println("a:"+ans[0]);
			System.out.println("e:"+ans[1]);
			System.out.println("i:"+ans[2]);
			System.out.println("o:"+ans[3]);
			System.out.println("u:"+ans[4]);
			if(t!=n-1)
			System.out.println();
		}
	}
}
