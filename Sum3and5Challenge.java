public class Sum3and5Challenge {
    public static void main(String[] args) {

        int sum = 0;
        int count =0;

        for(int i = 1; count < 5 && i <= 1000; i++) {
            if(i % 15 == 0) {
                sum += i;
                count++;
                System.out.println("The number is " + i);
            }
        }

        System.out.print("The sum of all numbers from 1 to 1000 which are divisible by 3 and 5 is " + sum);
    }   
}
