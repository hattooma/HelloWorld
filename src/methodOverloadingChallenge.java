public class methodOverloadingChallenge {
    public static void main(String[] args) {
        int heightInInches = 68;
        double centimetersFromInches = convertToCentimeters(heightInInches);
        System.out.println(heightInInches + " inches is equal to " + centimetersFromInches + " centimeters.");

        int feet = 5;
        int remainingInches = 8;
        double centimetersFromFeetAndInches = convertToCentimeters(feet, remainingInches);
        System.out.println(feet + " feet and " + remainingInches + " inches is equal to " + centimetersFromFeetAndInches + " centimeters.");
    }

    // Method to convert inches to centimeters
    public static double convertToCentimeters(int inches) {
        double centimeters = inches * 2.54;
        return centimeters;
    }

    // Method to convert feet and inches to centimeters
    public static double convertToCentimeters(int feet, int inches) {
        int totalInches = feet * 12 + inches;
        return convertToCentimeters(totalInches);
    }

}

