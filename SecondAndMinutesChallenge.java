public class SecondAndMinutesChallenge {
    // public static String getDurationString(int seconds) {
    //     int hours = (int)(seconds / 3600);
    //     int minutes = (int)(seconds / 60) - hours * 60;
    //     int leftSeconds = seconds - (hours * 3600 + minutes * 60);
    //     return hours + "h " + minutes + "m " + leftSeconds + "s'" ; 
    //     // return (int)(seconds / 3600) + "h " + ((int)(seconds /60) - (int)((seconds/3600)*60) + "m " + ((int)seconds - (int)((int)(seconds/3600)*60) - (int)(seconds/60)*60)); 
    // }

    // public static String getDurationString(int minutes, int seconds) {
    //     int newSeconds = (int)((minutes * 60) + seconds);
    //     int hours = (int)(newSeconds / 3600);
    //     int newMinutes = (int)(newSeconds / 60 - (hours * 60));
    //     int leftSeconds = newSeconds - (hours * 3600 + newMinutes * 60);
    //     return hours + "h " + newMinutes + "m " + leftSeconds + "s'" ;
    // }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(6556));
        System.out.println(getDurationString(100, 456));
    }
}