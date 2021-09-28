import java.util.Scanner;

public class BJ1110_더하기사이클 {

	static int n;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int sum=0;
		int cnt=1;
		int aa=n/10;
		int bb=n%10;
		
		int a=aa; int b=bb;
		sum=a+b;

		while(!(b==aa && sum%10==bb)) {
			cnt++;
			sum=a+b;
			
			a=b;
			b=sum%10;
			
			sum=a+b;
		}
		System.out.println(cnt);
	}
}

