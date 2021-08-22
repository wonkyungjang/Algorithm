import java.util.Scanner;

public class BJO_2567 {
	static int N;
	static int arr[][];
	static int ex[];
	static int count;
	static int dr[]= {-1,1,0,0};
	static int dc[]= {0,0,-1,1};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		arr=new int[102][102];
		ex=new int[2];
		count=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<2;j++) {
				ex[j]=sc.nextInt();
			}
			
			for(int r=ex[0]+1;r<ex[0]+1+10;r++) {
				for(int c=ex[1]+1;c<ex[1]+1+10;c++) {
						arr[r][c]=1;
					
				}
			}
			
		}

		for(int i=0;i<102;i++) {
			for(int j=0;j<102;j++) {
				if(arr[i][j]==1) {
					for(int d=0;d<4;d++) {
						int nr=i+dr[d];
						int nc=j+dc[d];
						if(nr>=0&&nr<102&&nc>=0&&nc<102) {
							if(arr[nr][nc]!=1) {
								 count++;
							}
						}
						
					}
				}
			}
		}
		System.out.println(count);
		
		
	}
}
