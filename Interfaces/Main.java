package Interfaces;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.panic_and_run();
        hawk.hunt();
        fish.hunt();
        fish.panic_and_run();
    }
}