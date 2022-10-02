public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] accounts = {{1,2,3}, {4,5,6}};
        System.out.println(solution.maximumWealth(accounts));
    }

    static class Solution {
        public int maximumWealth(int[][] accounts) {
            int max = 0;
            for (int i = 0; i < accounts.length; i++) {
                int sum = 0;

                for (int j = 0; j < accounts[i].length; j++) {
                    sum += accounts[i][j];
                }
                max = Math.max(max, sum);
            }
            return max;
        }
    }
}