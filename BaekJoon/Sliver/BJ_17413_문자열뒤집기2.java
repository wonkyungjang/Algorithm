import java.util.Scanner;
import java.util.Stack;

public class BJ_17413_문자열뒤집기2 {

	static Stack<Character> stack;
	static boolean istag;
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder(); 
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		stack=new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='<') {
				
				while(!stack.isEmpty()) {
					System.out.print(stack.pop());
				}
				
				istag=true;
			}
			else if(s.charAt(i)=='>') {
				istag=false;
				System.out.print(s.charAt(i));
			}
			else if(s.charAt(i)==' ' && istag==true)
				System.out.print(' ');
			else if(s.charAt(i)==' ' && istag==false) {
				while(!stack.isEmpty()) {
					System.out.print(stack.pop());
				}
				System.out.print(' ');
			}
			
			if(istag==false && s.charAt(i)!=' ' && s.charAt(i)!='>')
				stack.add(s.charAt(i));
			else if(istag==true && s.charAt(i)!=' ' && s.charAt(i)!='>')
				System.out.print(s.charAt(i));
			
			
			if(i==s.length()-1) {
				while(!stack.isEmpty()) {
					System.out.print(stack.pop());
				}
			}
			
		}
	}
}
