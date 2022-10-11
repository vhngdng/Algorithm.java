
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _796 {

    /*
     * Given two strings s and goal, return true if and only if s can become goal
     * after some number of shifts on s.
     * 
     * A shift on s consists of moving the leftmost character of s to the rightmost
     * position.
     * 
     * For example, if s = "abcde", then it will be "bcdea" after one shift.
     */
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString2(s, goal));
    }


    public static boolean rotateString2(String s, String goal) {
        List<String> arr = new ArrayList<>();
        int length = s.length();
        String test = new String();
        for (int i = 1; i < s.length(); i ++) {
            test = s.substring(i, length).concat(s.substring(0, i));
            if (test.equals(goal)) return true;
            arr.add(test);
            if (test.charAt(0) == goal.charAt(0)) break;
        }     
        return arr.contains(goal);
    }

}