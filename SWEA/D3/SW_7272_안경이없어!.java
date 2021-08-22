import java.util.Scanner;

public class SW_7272 {

	static String hole= "ADOPQR";
	static int N;
	static String answer;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			String str1=sc.next();
			String str2=sc.next();	
			answer="SAME";

			//str1하고 str2 길이 같은지 확인 다르면 바로 return
			if(str1.length()!=str2.length()) {
				answer="DIFF";
				System.out.println("#"+i+" "+answer);
				continue;
			}
			
			//문자열 길이 같으면 문자 하나씩 비교
			else {
				
				for(int j=0;j<str1.length();j++) {
					char c1=str1.charAt(j);
					char c2=str2.charAt(j);
					
					//c1이 B일 때 c2도 B인지
					if(c1=='B') {
						if(c2!='B') {
							answer="DIFF";
							break;
						}
					}else if(c2=='B') {
						if(c1!='B') {
							answer="DIFF";
							break;
						}
					}
					
					//c1이 홀일때 c2가 노홀인지 , c1이 노홀일때 c2가 홀이면 diff
					else {
						
						if(hole.contains(Character.toString(c1)) && 
								!hole.contains(Character.toString(c2))) {
							answer="DIFF";
							break;
						}
						
						else if(!hole.contains(Character.toString(c1)) && 
								hole.contains(Character.toString(c2))) {
							answer="DIFF";
							break;
						}
					}			
			}
				
			}
			System.out.println("#"+i+" "+answer);
			
		}

	}

}
