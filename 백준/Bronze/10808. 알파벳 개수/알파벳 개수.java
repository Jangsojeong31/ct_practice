import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char[] ch = S.toCharArray();
		int[] b = new int[26];

		for(int i = 0; i < ch.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if ( ch[i] == (char)(j + 'a') ) {
					b[j]++;
				}
			}
		}
		
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		
	}
}