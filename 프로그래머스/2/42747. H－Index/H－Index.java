import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        // 남은 논문 개수 찾기
        for (int i = 0; i < citations.length; i++) {
            
            int h = citations.length - i;
            
            if (citations[i] >= h) {
                return h;
            }
        }
        
        return answer;
    }
}