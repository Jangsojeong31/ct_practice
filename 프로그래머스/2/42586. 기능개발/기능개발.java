import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        // 완료일까지 걸리는 일수 계산
        for (int i = 0; i < progresses.length; i++) {
            int day = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
            queue.offer(day);
        }
        
        List<Integer> result = new ArrayList<>();
        
        while (!queue.isEmpty()) {
            
            int deployDay = queue.poll();
            int count = 1;
            
            while (!queue.isEmpty() && queue.peek() <= deployDay) {
                queue.poll();
                count++;
            }
            
            result.add(count);
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}