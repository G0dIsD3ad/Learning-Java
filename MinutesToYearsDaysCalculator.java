public class MinutesToYearsDaysCalculator {
        public static void printYearsAndDays(long minutes) {
            if(minutes < 0) {
                System.out.print("Invalid Value");
            }
            // 1 day = 1440 minutes
            // 1 year = 5,25,600 minutes
            else {
                long years = minutes / 525600;
                long days = minutes / 1440 - years * 365;
                System.out.print(minutes + " min = " + years + " y and " + days + " d");
            }
        }

        public static void main(String[] args) {
            printYearsAndDays(-1440);
        }
}
