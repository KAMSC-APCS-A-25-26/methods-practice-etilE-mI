import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        // TODO: Get user input for trip details
        // - Distance (miles)
        // - Average speed (mph)
        // - Fuel efficiency (miles per gallon)
        // - Fuel price per gallon
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter trip distance (miles): ");
        double distance = sc.nextDouble();
        System.out.println("Enter average speed (mph): ");
        double speed = sc.nextDouble();
        System.out.println("Enter trip fuel efficiency (mpg): ");
        double mpg = sc.nextDouble();
        System.out.println("Enter fuel price: ");
        double price = sc.nextDouble();
        displayResults(calculateTravelTime(distance, speed), calculateFuelNeeded(mpg, distance), calculateTripCost(distance, mpg, price));
    }
        // TODO: Calculate travel time using a return method
    public static double calculateTravelTime(double distance, double speed) {
        return distance / speed;
    }
        // TODO: Calculate fuel needed using a return method
    public static double calculateFuelNeeded(double distance, double mpg) {
        return distance / mpg;
    }
        // TODO: Calculate trip cost using a return method
    public static double calculateTripCost(double distance, double mpg, double price) {
        return distance / mpg * price;
    }
        // TODO: Display results using a void method
    public static void displayResults(double time, double fuel, double cost) {
        System.out.println("Results: ");

        // TODO: Implement calculateTravelTime method
        System.out.println("Travel Time: " + String.format("%.2f", time) + " hours");
        // TODO: Implement calculateFuelNeeded method
        System.out.println("Fuel Needed: " + String.format("%.2f", fuel) + " gallons");
        // TODO: Implement calculateTripCost method
        System.out.println("Trip Cost: $" + String.format("%.2f", cost));
        // TODO: Implement displayResults method
    }
}
