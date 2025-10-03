import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		StringBuffer s = new StringBuffer();
		
		for (int i = 0; i < N; i++) {
			int M = sc.nextInt();
			switch(M) {
			case 1:
				int num = sc.nextInt();
				st.push(num);
				break;
			case 2:
				if (st.isEmpty()) {
					s.append("-1\n");
				} else {
					s.append(st.pop() + "\n");
				}
				break;
			case 3:
				s.append(st.size() + "\n");
				break;
			case 4:
				if (st.isEmpty()) {
					s.append("1\n");
				} else {
					s.append("0\n");
				}
				break;
			case 5:
				if (st.isEmpty()) {
					s.append("-1\n");
				} else {
					s.append(st.peek() + "\n");
				}
				break;
			}
				
		}
		
		System.out.println(s);
		
	}
}