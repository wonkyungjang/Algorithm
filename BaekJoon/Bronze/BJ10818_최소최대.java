import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10818_최소최대 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		while(st.hasMoreElements()) {
			int t=Integer.parseInt(st.nextToken());
			if(min>t) min=t;
			if(max<t) max=t;
		}
		
		System.out.println(min+" "+max);
	}

}
