public class LastDIgitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if(!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)) {
            return false;
        }
        return (((firstNumber % 10) == (secondNumber % 10))) || ((secondNumber % 10) == (thirdNumber % 10)) || ((thirdNumber % 10) == (firstNumber % 10));
    }

    public static boolean isValid(int number) {
            return (number >= 10 && number <= 1000);
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
}