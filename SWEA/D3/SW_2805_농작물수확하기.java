package algo_D3_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW_농작물수확하기 {
	
	static int T; // 테케 수
	static int N; // 농장의 크기
	static int[][] arr;//농장배열
	static int sum; //합
	static int blank;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			N=Integer.parseInt(br.readLine());
			arr=new int[N][N];
			sum=0;
			blank=N/2;
			for(int r=0;r<N;r++) {
				char[] cs=(br.readLine()).toCharArray();
				for(int c=0;c<N;c++) {
					arr[r][c]=cs[c]-'0';
				}
			}
				
				for(int i=0;i<=N/2;i++) {
					for(int j=blank;j<blank+(2*i+1);j++) {
						sum+=arr[i][j];
					}
					blank--;
				}
				blank=blank+2;
				for(int i=N/2+1;i<N;i++) {
					for(int j=blank;j<blank+(N-1-i)*2+1;j++) {
						sum+=arr[i][j];
					}
					blank++;
				}
				
				System.out.println("#"+t+" "+sum);
			}

		
		}
	}


