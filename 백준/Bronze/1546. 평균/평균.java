import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = 0;
		long sum = 0;
		for (int i = 0; i < N; i++) {
			int score = sc.nextInt();
			sum += score;
			if (score > M) M = score;
		}
		// System.out.println(sum / M * 100.0 / N);
		System.out.println(sum * 100.0 / M / N);
		// double이 하나라도 포함되면 -> double 연산
		// * 과 / 는 동일한 우선순위 : 왼쪽에서 오른쪽으로 연산됨 
		// 위의 코드는 sum / M 에서 정수 나눗셈 발생 -> 소수점 버림
		// 아래 코드는 sum * 100.0 에서 double 연산 -> 이후 계속 double 연산
		
	}
}