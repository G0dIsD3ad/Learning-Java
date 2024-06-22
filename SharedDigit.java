public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if(firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }
        int testfirstNumber = firstNumber;

        while(testfirstNumber != 0) {
            int testsecondNumber = secondNumber;
            while(testsecondNumber != 0) {
                if((testfirstNumber % 10) == (testsecondNumber % 10)){
                    return true;
                }
                testsecondNumber /= 10;
            }
            testfirstNumber /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 13));
    }
}