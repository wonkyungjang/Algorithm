import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2292_벌집 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int sum=1; int cnt=0;
		while(true) {
			sum=sum+6*cnt;
		
			if(sum<N) cnt++;
			else break;
		}
		
		System.out.println(cnt+1);
	}

}
