class Car {
    // Code will go here
}
class Car {
    String make;
    String model;
    int year;
}
class Car {
    //... (attributes)...

    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}
public class CarDemo {
    public static void main(String[] args) {
        // Code will go here
    }
}
Car myCar = new Car();
myCar.make = "Toyota";
myCar.model = "Corolla";
myCar.year = 2020;
myCar.displayInfo();

