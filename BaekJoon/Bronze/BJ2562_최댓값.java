import java.util.Arrays;
import java.util.Scanner;

public class BJ2562_최댓값 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[9];
		int max=Integer.MIN_VALUE;
		int idx=0;
		for(int i=0;i<9;i++) {
			arr[i]=sc.nextInt();
			if(max<arr[i]) {
				max=arr[i];
				idx=i;
			}
		}
		System.out.println(max);
		System.out.println(idx+1);
	}

}
