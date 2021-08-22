import java.util.Scanner;

public class BJO_직사각형을만드는방법 {
	
	static int N;
	static int sum;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		sum=0;
		//System.out.println(N+"은 "+search(N));
		for(int i=1;i<=N;i++) {
			sum+=search(i);
		}
		
		System.out.println(sum);
		

	}

	private static int search(int n) {
		int cnt=0;
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0) cnt++;
		}
		return cnt;
		
		
	}

}
