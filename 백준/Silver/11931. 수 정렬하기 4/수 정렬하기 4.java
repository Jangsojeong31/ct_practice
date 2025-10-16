import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		int[] A = new int[N];
		for (int i=0; i < N; i++) {
			A[i] = Integer.parseInt(bf.readLine());
		}
		
		Arrays.sort(A);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=N-1; i>=0; i--) {
			sb.append(A[i] + "\n");
		}
		
		System.out.println(sb);
		
	}
}