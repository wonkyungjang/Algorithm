import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ1546_평균 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		double sum=0;
		StringTokenizer st=new StringTokenizer(br.readLine());
		double max=Double.MIN_VALUE;
		ArrayList<Double> list=new ArrayList<Double>();
		for(int i=0;i<n;i++) {
			double t=Double.parseDouble(st.nextToken());
			list.add(t);
			if(max<t) max=t;
		}
		for(int i=0;i<n;i++) {
			sum+=list.get(i)/max*100;
		}
		System.out.println((double)sum/n);
	}	
}
