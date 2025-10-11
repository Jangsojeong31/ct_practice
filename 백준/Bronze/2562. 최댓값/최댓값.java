import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[9];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		int max = 0;
		int index = 0;
		
		for (int i = 0; i < nums.length; i++ ) {
			if (nums[i] > max) {
				max = nums[i];
				index = i + 1;
			}
		}
		System.out.println(max + "\n" + index);
	}
}
