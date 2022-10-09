public class _344 {
    public static void main(String[] args) {
        char s[] = {'h','e','l','l','o'};
        reverseString(s);
        String result = String.valueOf(s);
        System.out.println(result);
        deQuy(s);
        System.out.println(String.valueOf(s));
    }

    public static void reverseString(char[] s) {
        int n = s.length;
        for (int i = 0; i < n/2; i++) {
            char temp = s[i];
            s[i] = s[n - i - 1];
            s[n- i - 1] = temp;
        }
    
    }

    public static void deQuy(char[] s) {
        
        if (s[0] == 'o') return;
        int n = s.length;
        for (int i = 0; i < n - 1; i++) {
            s[n -i - 1] = s[n - i - 2];
            
        }
        deQuy(s);
    }

    
}
