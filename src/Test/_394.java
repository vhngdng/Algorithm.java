import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _394 {
    public static void main(String[] args) {
        decodeString("2[abc]3[cd]ef");
    }

    public static String decodeString(String s) {
        String result = null;
        int open = s.indexOf("[");
        int lastOpen = s.lastIndexOf("[");
        // List<String> arr = new ArrayList<String>(Arrays.asList(s.split("")));
        int close = s.lastIndexOf("]");
        int closeFirst = s.indexOf("]");
        String newString = s.substring(open + 1, s.length());
        System.out.println(newString);
        if (newString.contains("[")) {
            decodeString(newString);
        } else {
            int dup = open - 1;
            for (int i = lastOpen - 1; i >= 0; i--) {
                if (s.substring(0, i - 1).contains("[") == false) {
                    break;
                } else if (s.charAt(i) == '[') {
                    dup = i + 1;
                    break;
                }
            }
            if (dup < open) {
            int num = Integer.valueOf(s.substring(dup, open));
            int numLength = s.substring(dup, open).length();
            String duplicateString = s.substring(lastOpen + 1, close);
            System.out.println(duplicateString);
            duplicateString = duplicate(duplicateString,duplicateString, num );
            System.out.println(duplicateString);
            result = s.substring(0, lastOpen - 1 - numLength) + duplicateString + s.substring(close + 1, s.length());
            result = decodeString(result);
            System.out.println(result);
            }
            // int num2 = Integer.valueOf(s.substring(open + 1, closeFirst - 1));
            return result;
        }

        return result;
    }

    public static String duplicate(String s,String dup, int i) {
        
        for (int j = 1; j < i; j++ ) {
            s += dup;
        }

        return s;

    }
}
