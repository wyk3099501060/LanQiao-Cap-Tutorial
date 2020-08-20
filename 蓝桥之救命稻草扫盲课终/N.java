package Óï·¨;
import java.util.*;
public class N {
	public static long ans[][]=new long [32][32];
	public static void Init(){
		ans[1][1]=1;
		for(int i=2;i<32;i++){
			for(int j=1;j<32;j++){
				ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Init();
		while(sc.hasNext()){
			int n=sc.nextInt();
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					if(ans[i][j]==0){
						continue;
					}else{
						System.out.print(ans[i][j]+(i==j?"":" "));
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
