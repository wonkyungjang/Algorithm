import java.util.Arrays;
import java.util.Scanner;

public class BJ8958_OX퀴즈 {
	static int sum,cnt;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			
			String str=sc.next(); //개행문자 무시. nextLine은 개행문자 무시 x
			char c[]=str.toCharArray();
			//System.out.println(Arrays.toString(c));
			cnt=0; sum=0;
			for(int i=0;i<c.length;i++) {
				
				if(c[i]=='O') {
					cnt++;
					sum+=cnt;
				}else
					cnt=0;
			}
			System.out.println(sum);
			
		}
		
	}

}
