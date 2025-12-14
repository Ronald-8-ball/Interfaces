package VehicleInterface;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Car accelerating to " + speed + " mph");
    }

    @Override
    public void brake(int deceleration) {
        System.out.println("Car braking with deceleration " + deceleration + " mph");
    }
}
