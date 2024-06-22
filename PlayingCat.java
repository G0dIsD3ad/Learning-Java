public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        // if(summer == true) {
        //     return temperature >= 25 && temperature <= 45;
        // }
        // else if(summer == false) {
        //     return temperature >= 25 && temperature <= 35;
        // }
        // return false;

        int max = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max;
    }
}

// Always use Ternary Oprerators when given only two choices.