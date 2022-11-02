import java.util.Arrays;

public class _929 {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        // {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        String result = new String();
        String result2[] = new String[emails.length];
        int k = 0;
        int resultNum = 1;
        
        for (int i = 0; i < emails.length; i ++) {
            int num = emails[i].indexOf("@");
            // System.out.println(num);

            result = getStringFromIndexOf(emails[i], "@");
            result = getStringFromIndexOf(result, "+");
            if (result.indexOf(".") != -1) {
                result = result.replaceAll(".", "");
                
            }
            // System.out.println(result);
            result2[k++] = result;
            System.out.println(result2[k - 1]);
            for (int j = 0; j < k - 1; j++) {
                if (result2[j].equals(result)) {
                break;
                
                }
                 if (j == k -2)
                resultNum++;
            }
        }
        

        return resultNum ;
    }

    public static String getStringFromIndexOf (String str, String a ) {
            int num = str.indexOf(a);
            if (num == -1) return str;

            String string = str.substring(0, num); 
            
        return string;
    }
}
