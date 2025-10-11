import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] nums = new int[9];
		
		for(int i = 0; i < 9; i++) {
			nums[i] = Integer.parseInt(bf.readLine());
		}
		
		int max = 0;
		int index = 0;
		
		for (int i = 0; i < 9; i++ ) {
			if (nums[i] > max) {
				max = nums[i];
				index = i + 1;
			}
		}
		System.out.println(max);
        System.out.println(index);
	}
}
