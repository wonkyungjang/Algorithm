package algo_D3_alone;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SW_괄호짝짓기 {
	static int poss=1;
	static int N;
	static String open="([{<";
	static String close=")]}>";
	static Queue<Character> q;
	static Stack<Character> opens;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int t=1;t<=10;t++) {
			q=new LinkedList<>();
			opens=new Stack<>();
			N=sc.nextInt();
			poss=1;
			String s=sc.next();
			char[]ss=s.toCharArray();
			for(int i=0;i<N;i++) {
				q.offer(ss[i]);
			}
			//System.out.println(q);
			//열린 괄호 만나면
			for(int j=0;j<N;j++) {
				char c=q.poll();
				//열린 괄호면 오픈즈 스택에 추가
				if(open.contains(Character.toString(c))) {
					opens.push(c);
					//System.out.println(opens);
				//닫힌 괄호면
				}else {
					if(!opens.isEmpty()) {
						char o=opens.pop();//오픈즈의 탑을 하나 빼서 그 짝인지 확인
						if(close.indexOf(Character.toString(c))
								!=open.indexOf(Character.toString(o))){
							poss=0;
						}
					}	
				}
			}
		System.out.println("#"+t+" "+poss);
		}

	}

}
