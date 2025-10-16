

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
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
		
		int count = 0;
		
		// 버블 정렬
		for (int i=0; i<N-1; i++) {
			for (int j=0; j<N-1-i; j++) {
				if (A[j] > A[j+1]) {
					swap(A, j, j+1);
					count++;
					
					if (count == K) {
						System.out.println(A[j] + " " +A[j+1]);
						return;
					}
				}
			}
		}
		
		System.out.println(-1);
	}
}

