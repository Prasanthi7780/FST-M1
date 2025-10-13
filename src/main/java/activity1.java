

class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car() {
        tyres = 4;
        doors = 4;
    }

    void displayCharacteristics() {
        System.out.println("Color: " + color);
        System.out.println("Transmission: " + transmission);
        System.out.println("Make: " + make);
        System.out.println("Tyres: " + tyres);
        System.out.println("Doors: " + doors);
    }

    void accelarate() {
        System.out.println("Car is moving forward.");
    }

    void brake() {
        System.out.println("Car has stopped.");
    }
}
class activity1 {
    public static void main(String[] args) {
        // Create object of Car class
        Car car1 = new Car();

        // Initialize values
        car1.make = 2014;
        car1.color = "Black";
        car1.transmission = "Manual";

        // Call methods
        car1.displayCharacteristics();
        car1.accelarate();
        car1.brake();
    }
}