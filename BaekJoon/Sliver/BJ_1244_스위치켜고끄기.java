import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BJ_1244_스위치켜고끄기 {
	static int N;
	static int [] sw;
	static int students;
	//static int sex,idx;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		sw=new int[N];
		for(int i=0;i<N;i++) {
			sw[i]=sc.nextInt();
		}
		students=sc.nextInt();
		for(int i=0;i<students;i++) {
			int sex=sc.nextInt(); //성별. 1은 남자 2는 여자
			int num=sc.nextInt(); //번호
			
			if(sex==1) {
				int k=1;
				for(int j=num; j<=sw.length; j=num*k) {
					k++;
					if(sw[j-1]==0) sw[j-1]=1;
					else sw[j-1]=0;
				}
			}else {
				num=num-1;
				int low=num-1;
				int high=num+1;
				ArrayList<Integer> list=new ArrayList<>();
				list.add(num);
		
				while(low>=0 && high<sw.length) {
				if(sw[low]==sw[high]) {
					list.add(low);
					list.add(high);
					low=low-1;
					high=high+1;
				}else break;
				}
				for(int l=0;l<list.size();l++) {
					if(sw[list.get(l)]==0) sw[list.get(l)]=1;
					else sw[list.get(l)]=0;
				}
			}
		}
		/*for(int i=0;i<sw.length;i++) {
			System.out.print(sw[i]+" ");
		}*/
		
		for(int i=1;i<=sw.length;i++) {
			System.out.print(sw[i-1]+" ");
			if(i%20==0) System.out.println();
		}
	}

}
