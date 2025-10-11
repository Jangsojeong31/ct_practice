
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine().toUpperCase();

		int[] arr = new int[26];
		
		for(char c : word.toCharArray()) {
            if ('A' <= c && c <= 'Z') {
                arr[c - 'A']++;    
            }
		}
		
		int max = 0;
		char result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				result = (char) (i + 'A');
			} else if (arr[i] == max) {
				result = '?';
			}
		}
        
		System.out.println(result);
	}
}
