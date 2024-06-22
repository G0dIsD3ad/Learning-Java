public class DecimalComparator {
        public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
            int newFirstNum = (int)(firstNum * 1000);
            int newSecondNum = (int)(secondNum * 1000);
            // System.out.print("false");

            return newFirstNum == newSecondNum;
        }

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    }
}