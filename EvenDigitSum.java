public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int evenSum = 0;
        int lastDigit;
        
        if(number < 0) {
            return -1;
        }

        if(number >= 0) {
            while(number > 0) {
                lastDigit = number % 10;
                if(lastDigit % 2 == 0) {
                    evenSum += lastDigit;
                }
                number /= 10;
            }
        }
        return evenSum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }
}
