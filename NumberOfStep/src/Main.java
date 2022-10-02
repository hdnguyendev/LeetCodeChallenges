public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.print(solution.numberOfSteps(14));
    }

    static class Solution {
        public int numberOfSteps(int num) {
            int steps = 0;

            while (num > 0) {
                if (num % 2 == 0) {
                    num /= 2;
                    steps++;
                } else {
                    num -= 1;
                    steps++;
                }
            }
            return steps;
        }
    }
}