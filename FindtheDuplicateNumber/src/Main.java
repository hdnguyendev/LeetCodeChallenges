public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] n = {1, 3, 3, 4};
        System.out.print(solution.findDuplicate(n));
    }
    static class Solution {
        public int findDuplicate(int[] nums) {
            int[] check = new int[nums.length];
            for (int i=0;i<nums.length;i++){
                check[nums[i]]++;
                if (check[nums[i]] == 2) return nums[i];
            }
            return 0;
        }
    }
}