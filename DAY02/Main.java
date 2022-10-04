import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String s = "Java123";
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));
        for (char c : arr) {
            if (Character.isDigit(c))
                System.out.println(c);
        }

        char c = 65;
        System.out.println(c);

        System.out.println((int) 'a');

        String str = "";
        str = "hoc " + "lap " + "trinh ";
        for (int i = 0; i < 3; i++) {
            str = str + i + "-";
        }

        System.out.println(str);

        StringBuilder sb = new StringBuilder("ABC");
        sb.append("XYZ");
        System.out.println(sb);
        System.out.println(sb.insert(2, "abc"));
        System.out.println(sb);
        sb.replace(2, 5, "xyz");
        System.out.println(sb);
        System.out.println(sb.delete(0, 2));
        System.out.println(sb.reverse());

        String[] word1 = { "abc", "d", "defg" };
        String[] word2 = { "abcddefg" };

        System.out.println(arrayStringsAreEqual(word1, word2));

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        if (word1.length > 1) {
            for (int i = 0; i < word1.length; i++) {
                str1 += word1[i];
            }
        } else {
            str1 = word1[0].toString();
        }
        if (word2.length > 1) {
            for (int i = 0; i < word2.length; i++) {
                str2 += word2[i];
            }
        } else {
            str2 = word2[0].toString();
        }
        System.out.println(str1);
        System.out.println(str2);

        return str1.equals(str2);
    }

}