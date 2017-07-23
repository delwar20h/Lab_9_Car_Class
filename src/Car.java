/**
 * Created by Delwar on 7/20/2017.
 */
public class Car {

    // instance variables
    private String carMake;
    private String carModel;
    private int carYear;
    private double carPrice;

    // constructor to set data members to default values
    public Car () {
        carMake = "";
        carModel = "";
        carYear = 0;
        carPrice = 0.0;
    }

    // all-argument contructors
    public Car (String make, String model, int year, double price) {
        carModel = make;
        carModel = model;
        carYear = year;
        carPrice = price;
    }

    //getters (accessors) provide public view access to
    public String getCarMake() {
        return carMake;
    }
    public String getCarModel() {
        return  carModel;
    }

    public int getCarYear() {
        return carYear;
    }
    public double getCarPrice (){
        return carPrice;
    }

    //setters (mutators) provide public write access to
    //  private instance variables

    public void setCarMake (String carMake) {
        this.carMake = carMake;
    }
    public void setCarModel (String carModel) {
        this.carModel = carModel;
    }
    public void setCarYear (int carYear) {
        this.carYear = carYear;
    }
    public void setCarPrice (double carPrice){
        this.carPrice = carPrice;
    }

}
