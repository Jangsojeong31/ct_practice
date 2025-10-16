
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N];
		st = new StringTokenizer(bf.readLine());
		for (int i=0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		int flag = 0;
		
		// 선택 정렬
		for (int i=N-1; i>=1; i--) {
			int maxIdx = i;
			for (int j=i-1; j>=0; j--) {
				if(A[j] > A[maxIdx]) {
					maxIdx = j;
				}
			}
			
			if(maxIdx != i) {
				int temp = A[maxIdx];
				A[maxIdx] = A[i];
				A[i] = temp;
				flag++;	
				
				if(flag == K) {
					System.out.println(A[maxIdx] + " " + A[i]);
					return; // 프로그램 종료
				}
			}
			
		}
		
		System.out.println(-1);
	}
}

