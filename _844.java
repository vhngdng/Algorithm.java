public class _844 {
    public static void main(String[] args) {
        String s ="ab##";
           String t = "c#d#";
           System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        s = getStringFromIndexOf(s, "#");
        t = getStringFromIndexOf(t, "#");
        System.out.println(s);
        System.out.println(t);
        if (s.equals(t)) return true;
        return false;
    }

    public static String getStringFromIndexOf (String str, String a ) {
        int num = str.indexOf(a);
        String first = new String();
        if (num < 1) return str;
        
        String last = str.substring(num + 1, str.length());
        int specialNum = last.indexOf(a) + 1;
        if (specialNum == 0) specialNum = 0;
        if((num - 1 - specialNum) < 0)
            first = "";
        else{
            first = str.substring(0, num - 1 - specialNum);
        }
        // System.out.println( "first" + first);
        // System.out.println("last" + last);

        last = getStringFromIndexOf(last, a);

        if (last.equals("#")) last = "";
        String string = first + last; 

        
    return string;
}
}
