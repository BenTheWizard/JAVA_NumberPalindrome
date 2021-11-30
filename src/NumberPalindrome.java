public class NumberPalindrome {

    public static void main(String[] args) {
        boolean test =isPalindrome(11212);
        System.out.println(test);

    }
    public static boolean isPalindrome(int number) {
        int reverse = 0, lastDigit, startNumber;
        startNumber = number;
        while (number != 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        if (startNumber == reverse) {
            return true;
        } return  false;
    }
}
