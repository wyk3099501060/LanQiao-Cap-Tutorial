package �﷨;

import java.util.*;
//�����Ǵ�Сд��ֻ����ASCII���
public class V {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String s=sc.next();
			char c[]=s.toCharArray();
			char maxc='A';
			for(int i=0;i<c.length;i++){
				if(maxc<c[i]){
					maxc=c[i];
				}
			}
			StringBuilder ans=new StringBuilder();
			for(int i=0;i<c.length;i++){
				ans.append(c[i]);
				if(maxc==c[i]){
					ans.append("(max)");
				}
			}
			System.out.println(ans);
		}
	}
}
