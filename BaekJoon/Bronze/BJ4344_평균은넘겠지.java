import java.util.Scanner;

public class BJ4344_평균은넘겠지 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int sum=0;
			int num=sc.nextInt();
			int arr[]=new int[num];
			for(int i=0;i<num;i++) {
				arr[i]=sc.nextInt();
				sum+=arr[i];
			}
			double avg=sum/num;
			int cnt=0;
			for(int i : arr) {
				if(i>avg) cnt++;
			}
			System.out.format("%.3f%%%n", (cnt*1.0) / num * 100.0);
		}

	}

}
