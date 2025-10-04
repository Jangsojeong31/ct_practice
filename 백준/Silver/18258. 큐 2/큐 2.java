
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] queue = new int[N];
		int front = 0;
		int back = 0;
		
		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			
			switch(order) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				queue[back++] = num;
				break;
			case "pop":
				if(front == back) {
					sb.append("-1\n");
				} else {
					sb.append(queue[front++]).append("\n");
				}
				break;
			case "size":
				sb.append((back - front) + "\n");
				break;
			case "empty":
				sb.append(front == back ? "1\n" : "0\n");
				break;
			case "front":
				sb.append(front == back ? "-1" : queue[front]).append("\n");
				break;
			case "back":
				sb.append(front == back ? "-1" : queue[back - 1]).append("\n");
				break;
			}
			
		}
		
		System.out.println(sb);
		
	}
}
