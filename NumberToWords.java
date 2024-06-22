public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(0);
    }

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid value");
            return;
        }

        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);

        if(reversedNumber == 0) {
            System.out.println("Zero");
        } else {
            while (reversedNumber > 0) {
                int lastDigit = reversedNumber % 10;
                switch (lastDigit) {
                    case 0 -> System.out.println("Zero");
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                }
                reversedNumber /= 10;
            }
        }

        
        for(int i = 0; i < (originalDigitCount - reversedDigitCount); i++) {
            System.out.println("Zero");
        }

    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        if(number == 0) {
            return 1;
        }
        int count = 0;
        while(number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}