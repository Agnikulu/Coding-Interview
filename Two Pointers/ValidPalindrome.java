public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase(); 
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                str += c;
            }
        }
        
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s1 = "Was it a car or a cat I saw?";
        String s2 = "tab a cat";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
    }
}
