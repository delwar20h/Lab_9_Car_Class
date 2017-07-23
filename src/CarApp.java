
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Delwar on 7/20/2017.
 */

public class CarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String make = "";
        String model = "";
        int year = 0;
        double price = 0.0;

        System.out.print("How many vehicles would you like to stock: ");
        int vehiclesToStock = scan.nextInt();
        scan.nextLine();

        // Declares a array list of typ Car called vehicles
        // Array vehicles uses instance variables from the Cars class
        ArrayList<Car> vehicles = new ArrayList<Car>();

        // Temporary variable of type car to hold user input
        Car cars;

        // For loop runs until x < vehiclesToStock is false
        for (int x = 0; x < vehiclesToStock; x++) {
            // initialize cars using default constructor
            cars = new Car();

            System.out.print("Enter make for vehicle #" + (x + 1) + ": ");
            cars.setCarMake(scan.nextLine());
            System.out.print("Enter model for vehicle #" + (x + 1) + ": ");
            cars.setCarModel(scan.nextLine());
            System.out.print("Enter year for vehicle #" + (x + 1) + ": ");
            cars.setCarYear(scan.nextInt());
            scan.nextLine();
            System.out.print("Enter price for vehicle #" + (x + 1) + ": ");
            cars.setCarPrice(scan.nextDouble());
            scan.nextLine();
            System.out.println();

            // Adds information from cars into array list vehicles
            vehicles.add(cars);
        }
//FIXME us printf of better formatting
        System.out.println();
        System.out.println("\t\t\t\tVehicles in Inventory");
        System.out.println("======================================================");
        System.out.println("Make\t\t\t" + "Model\t\t\t" + "Year\t\t\t" + "Price\t\t\t");
        System.out.println("======================================================");

        // Runs through the stored user inputs and prints them in order
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(vehicles.get(i).getCarMake() + "\t\t\t" + vehicles.get(i).getCarModel() + "\t\t\t"
                    + vehicles.get(i).getCarYear() + "\t\t\t" + vehicles.get(i).getCarPrice());
        }
    }
}


