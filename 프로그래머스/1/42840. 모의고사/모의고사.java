import java.util.*;

class Solution {
    public int[] solution(int[] answers) {

        int[][] pattern = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] cor = new int[3];
        
        for (int j = 0; j < cor.length; j++) {
            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == pattern[j][i % pattern[j].length]) cor[j]++;
            }
        }
        
        int max = Math.max(cor[0], Math.max(cor[1], cor[2]));

        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < cor.length; i++) {
            if (cor[i] == max) result.add(i + 1);
        }
        
        return result.stream().mapToInt(i -> i.intValue()).toArray();
    }
}