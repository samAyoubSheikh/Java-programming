public class Car {
    private String carName;
    private int carPrice;
    private int carMileage;
    private String carOwner;

    //create a constructor
    public Car(String carName,int carPrice,int carMileage,String carOwner)
    {
        this.carName=carName;
        this.carMileage=carMileage;
        this.carPrice=carPrice;
        this.carOwner=carOwner;
    }
    //create setters incase of updating values

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarMileage(int carMileage) {
        this.carMileage = carMileage;
    }
    public void setCarPrice(int carPrice)
    {
        this.carPrice=carPrice;
    }
    public void setCarOwner(String carOwner)
    {
        this.carOwner=carOwner;
    }
    //create a method for displaying the values
    public void displayCarInfo()
    {
        System.out.println("Owner of the car is :"+carOwner);
        System.out.println("He has :"+carName);
        System.out.println("this car's price is "+ carPrice +"Million Rupees");
        System.out.println("and gives mileage of "+carMileage+"km/h");
    }
}
