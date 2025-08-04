import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		List<Integer> list = new LinkedList<>();
		for(int i = 0; i < N; i++) {
			list.add(i);
		}
		
		List<Integer> result = new ArrayList<>();
		
		int index = 0;
		
		
		while(list.size() > 0) {
			index = (index + K - 1) % list.size();
			result.add(list.remove(index) + 1);
		}
		
		System.out.print("<");
		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i));
			if (i != result.size() - 1) System.out.print(", ");
		}
		System.out.println(">");
	}
}