public class LeapYear {
    public static boolean isLeapYear(int year) {
        if(year >= 1 && year <= 9999)
        {
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                System.out.print("true");
                return true;
            }
            else {
                System.out.print("false");
                return false;
            }
        }
        System.out.print("false");
        return false;
    }

    public static void main(String[] args) {
        isLeapYear(1924);
    }
}