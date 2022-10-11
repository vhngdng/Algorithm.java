
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

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        else {
        List<String> arrList = new ArrayList<>();
        List<String> arrListResult = new ArrayList<>();
        String str = new String();
        String strResult = new String();
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                str = String.valueOf(s.charAt(i)).concat(String.valueOf(s.charAt(0)));
                arrList.add(str);
                strResult = String.valueOf(goal.charAt(i)).concat(String.valueOf(goal.charAt(0)));
                arrListResult.add(strResult);
                break;
            }
            str = s.substring(i, i + 2);
            arrList.add(str);

            strResult = goal.substring(i, i + 2);
            arrListResult.add(strResult);
        }

        return arrList.containsAll(arrListResult);
    }

    }

    public static boolean rotateString2(String s, String goal) {
        List<String> arr = new ArrayList<>();
        int length = s.length();
        String test = new String();
        for (int i = 1; i < s.length(); i ++) {
            if (test.lastIndexOf(s) == goal.lastIndexOf(goal)) break;
            test = s.substring(i, length).concat(s.substring(0, i));
            if (test.equals(goal)) return true;
            arr.add(test);
            
        }
        
        return arr.contains(goal);
    }

}