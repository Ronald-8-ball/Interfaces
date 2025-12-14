package VehicleInterface;

class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.accelerate(50);
        myCar.brake(20);
        myCar.stopEngine();

        Motorcycle myMotorcycle = new Motorcycle();
        myMotorcycle.startEngine();
        myMotorcycle.accelerate(70);
        myMotorcycle.brake(30);
        myMotorcycle.stopEngine();
    }
    
}