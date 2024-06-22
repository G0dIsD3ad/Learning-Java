public class LargestPrime {
    public static int getLargestPrime(int number) {
        if(number < 2) {
            return -1;
        }

        int num = -1;

        for(int i = 2; i <= number; i++) {
            while (number % i == 0) {
                num = i;
                number /= i;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
}
