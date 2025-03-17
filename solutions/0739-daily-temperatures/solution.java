import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> warm = new Stack<>();
        int n = temperatures.length;
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            while (!warm.isEmpty() && temperatures[i] > temperatures[warm.peek()]) {
                int index = warm.pop();
                answer[index] = i - index;
            }
            warm.push(i);
        }
        return answer;
    }
}

