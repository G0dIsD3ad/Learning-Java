public class challenge {
    public static void main(String[] args) {
        double a = 20d; //Step-1
        double b = 80d; //Step-2
        double c = a + b*100D;
        
        System.out.println(c); //Step-3
        
        double d = c % 40d;
        
        System.out.println(d); //Step-4
        
        boolean isVariable = d == 0; //Step-5

        System.out.println(isVariable); //Step-6

        if (isVariable == false) {
            System.out.println("Got some remainder = " + d);
        }
    }
}