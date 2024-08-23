public class ConversionTable {
        // Converts Feet To Meters
    public static double footToMeter(double foot) {
        return foot * 0.305;
    }
        // Converts Meters to feet
    public static double meterToFoot(double meter) {
        return meter / 0.305;
    }

    public static void main(String[] args) {
        System.out.println("Feet to Meters:");
        System.out.println("Feet\tMeters");
        for (int feet = 1; feet <= 10; feet++) {
            System.out.printf("%d\t%.2f%n", feet, footToMeter(feet));
        }

        System.out.println("\nMeters to Feet:");
        System.out.println("Meters\tFeet");
        for (int meters = 20; meters <= 65; meters += 5) {
            System.out.printf("%d\t%.2f%n", meters, meterToFoot(meters));
        }
    }
}