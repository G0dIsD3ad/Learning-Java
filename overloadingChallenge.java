public class overloadingChallenge {
    public static double covertToCentimeters(int heightInInches) {
        double heightInCentimeters = (double)(heightInInches * 2.54);
        return heightInCentimeters;
    }

    public static double convertToCentimeters(int heightInFeet, int remHeightInInches) {
        double heightInCentimeters = (double)(heightInFeet * 12 + remHeightInInches) * 2.54;
        return heightInCentimeters;
    }

    public static void main(String[] args) {
        System.out.println(covertToCentimeters(68));

        System.out.println(convertToCentimeters(5, 8));
    }
}