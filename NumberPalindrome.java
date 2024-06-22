public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int temp = number;
        int reverse = 0;
        while(temp != 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }
        return number == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(23244));
    }
}
