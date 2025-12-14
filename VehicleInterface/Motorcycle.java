package VehicleInterface;

public class Motorcycle implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Motorcycle accelerating to " + speed + " mph");
    }

    @Override
    public void brake(int deceleration) {
        System.out.println("Motorcycle braking with deceleration " + deceleration + " mph");
    }
}
