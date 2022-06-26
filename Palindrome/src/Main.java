public class Main {
    public static boolean isPalindrome(int x) {
        String s1 = Integer.toString(x);
        String s2 = "";
        char ch;
        for (int i=0; i<s1.length(); i++)
        {
            ch = s1.charAt(i);
            s2 = ch+s2;
        }
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}