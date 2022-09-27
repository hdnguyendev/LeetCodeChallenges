public class Main {
    public static void main(String[] args) {
        String ransomNote = "aab";
        String magazine = "baa";
        Solution solution = new Solution();
        System.out.print(solution.canConstruct(ransomNote,magazine));
    }
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        return magazine.contains(ransomNote);
    }
}