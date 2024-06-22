public class InequalityPrinter {
    public static void printEqual(int a, int b, int c)
    {
        if(a < 0 || b < 0 || c < 0){
            System.out.print("Invalid Value");
        }
        else if(a == b && b == c && c == a) {
            System.out.print("All values are equal");
        }
        else if ((a != b) && (b != c) && (c != a)) {
            System.out.print("All numbers are different");
        }
        else {
            System.out.print("Neither all are equal or different");
        }
    }

    public static void main(String[] args) {
        printEqual(1, 2, 3);
    }
}
