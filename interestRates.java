public class interestRates {
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static void main(String[] args) {
        for(double rate = 7.5; rate <= 10.0; rate += .25) {
            double interestAmount = calculateInterest(100, rate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("100 at " + rate + " % interest = " + interestAmount);
        }
    }
}
