public class Meters_To_Feet {
    
    public static void main(string[]args) {
        
        final double METERS_PER_FOOT = 0.305;
        
        system.out.println("Feet/Meters");
        system.out.println("------------");
        for(int feet =1; feet <=10; feet++) {
            double meters = feet * METERS_PER_FOOT;
            system.out.printf("%d\t%.4f%n", feet, meters);
        }
    }
}