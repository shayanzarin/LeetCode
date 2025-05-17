public class Palindrome {

    public static boolean isPalindrome(int x) {

        if (x<0) 
            return false;
        else if (x<10) 
            return true;
        
        int actualX = x;
        int result = 0;
        while (x>0) {
            int digit = x%10;
            result = result*10 + digit;
            x /=10;
        }

        if (result == actualX) {
            return true;
        }
        

        return false;
    }
    public static void main(String[] args) {
        int z = 252;
        System.out.println(isPalindrome(z));
    }
}
