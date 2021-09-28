import java.util.Scanner;

public class BJ2577_숫자의개수 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int cnt[] = new int[10];
		String str=A*B*C+"";
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++) {
			cnt[c[i]-'0']++;
		}
		for(int i : cnt) System.out.println(i);
	}

}
