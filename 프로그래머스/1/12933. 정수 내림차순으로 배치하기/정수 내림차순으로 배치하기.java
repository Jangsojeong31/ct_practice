import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] s = String.valueOf(n).split("");
        
        Arrays.sort(s);
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = s.length - 1; i >= 0; i--) {
            sb.append(s[i]);
        }
        
        return Long.parseLong(sb.toString());
    }
}