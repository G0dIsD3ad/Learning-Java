public class whileLoop {
    public static void main(String[] args) {
        // int j = 1;
        
        // while(j <= 5) {
        //     System.out.println(j);
        //     j++;
        // }

        // while(true) {
        //     if(j > 5) {
        //         break;
        //     }
        //     System.out.println(j);
        //     j++;
        // }

        // boolean isReady = true;
        
        // do { 
        //     if(j > 5) {
        //         break;
        //     }
        //     System.out.println(j);
        //     j++;
        // } while (isReady);

        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }    
}