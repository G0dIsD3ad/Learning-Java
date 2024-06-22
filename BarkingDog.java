public class BarkingDog {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay)
    {
        if(hourOfDay < 0)
        {
            //System.out.print("false");
            return false;
        }
        else if((hourOfDay < 8 || hourOfDay > 22) && isBarking == true)
        {
            //System.out.print("true");
            return true;
        }
        //System.out.print("false");
        return false;
    }

    public static void main(String[] args) {
        shouldWakeUp(true, -1);
    }
}
