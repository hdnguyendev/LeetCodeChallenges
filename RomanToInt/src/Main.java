import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid roman numeral in the range [1, 3999]: ");
        String input = sc.nextLine();

        System.out.print("=> After convert it to an integer, result is " + new Solution().romanToInt(input));
    }
}
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        for (int i = 0; i < s.length(); i++) {
            String x = String.valueOf(s.charAt(i));
            int value = map.get(x);
            int value_next = 0;
            if (i < s.length() - 1) {
                String x_next = String.valueOf(s.charAt(i+1));
                value_next = map.get(x_next);
            }
            result += value;
            if (value_next > value) {
                result -= value * 2;
            }
        }
        return result;
    }
}