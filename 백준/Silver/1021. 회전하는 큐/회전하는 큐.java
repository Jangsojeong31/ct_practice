import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int count = 0;
		
		Deque<Integer> d = new ArrayDeque<>();
		for (int i = 1; i <= N; i++) d.addLast(i);
		
		st = new StringTokenizer(br.readLine());
		while (M-- > 0) {
			int num = Integer.parseInt(st.nextToken());
			
			// 해당 숫자의 인덱스 찾기
			int idx = 0;
			for (int x : d) {
				if (x == num) break;
				idx++;
			}
			
			// 왼쪽/오르쪽 회전 
			while (d.peekFirst() != num) {
				if (idx <= d.size() / 2) {
					d.addLast(d.removeFirst());
				} else {
					d.addFirst(d.removeLast());
				}
				count++;
			}
			
			// 숫자 제거
			d.removeFirst();
		}
		
		System.out.println(count);
	}
}
