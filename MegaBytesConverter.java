public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0)
        {
            System.out.print("Invalid Value");
            return;
        }

        int megaBytes = (int) (kiloBytes / 1024);
        int newKiloBytes = kiloBytes - (megaBytes * 1024) ; 
        
        System.out.print
        (kiloBytes + " KB = " + megaBytes + " MB and " + newKiloBytes + " KB");
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
}
