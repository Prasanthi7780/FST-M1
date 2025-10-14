

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers = new ArrayList<>();
    private int maxPassengers;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void onboard(String name) {
        if (passengers.size() < maxPassengers) {
            passengers.add(name);
        } else {
            System.out.println("Plane is full");
        }
    }

    public void takeOff() {
        System.out.println("Plane took off at: " + new Date());
    }

    public void land() {
        lastTimeLanded = new Date();
        passengers.clear();
        System.out.println("Plane landed at: " + lastTimeLanded);
    }

    public List<String> getPassengers() {
        return passengers;
    }
}

public class activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onboard("John");
        plane.onboard("Steve");
        plane.onboard("Anna");

        plane.takeOff();
        System.out.println("People on the plane: " + plane.getPassengers());

        Thread.sleep(3000); // simulate flying

        plane.land();
        System.out.println("People on the plane after landing: " + plane.getPassengers());
    }
}
