
interface BicycleParts {
    int tyres = 2;
    int maxSpeed = 25;
}

interface BicycleOperations {
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations {
    int gears, currentSpeed;

    Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    public void applyBrake(int decrement) { currentSpeed -= decrement; System.out.println("Speed: " + currentSpeed); }
    public void speedUp(int increment) { currentSpeed += increment; System.out.println("Speed: " + currentSpeed); }

    public String bicycleDesc() {
        return "No of gears: " + gears + "\nMax speed: " + maxSpeed;
    }
}

class MountainBike extends Bicycle {
    int seatHeight;

    MountainBike(int gears, int currentSpeed, int seatHeight) {
        super(gears, currentSpeed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue) { seatHeight = newValue; }

    @Override
    public String bicycleDesc() {
        return super.bicycleDesc() + "\nSeat height: " + seatHeight;
    }
}

public class activity7 {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}

