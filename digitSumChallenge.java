public class digitSumChallenge {
    public static int sumDigits(int number) {
        int sum = 0;

        if(number < 0){
            return -1;
        }
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(32123));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(1234));
    }
}