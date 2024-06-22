public class whileLoopChallenge {
    public static boolean isEvenNumber(int number) {
        return number > 0 && (number % 2 == 0);
    }

    public static void main(String[] args) {
        int j = 4;
        int oddcounter = 0;
        int evencounter = 0;
        while (j <= 20) {
            // if(isEvenNumber(j) == true) {
            //     System.out.println(j);
            // }
            j++;
            if(!isEvenNumber(j)) {
                oddcounter++;
                continue;
                
                
            }
            System.out.println(j);
            evencounter++;
        }
        System.out.println("The numbers of odd numbers found are : " + oddcounter);
        System.out.println("The total number of even numbers found are : " + evencounter);
    }
}