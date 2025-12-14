package Interfaces;

public class Fish implements Prey, Predator{
    @Override
    public void hunt(){
        System.out.println("The catfish is hunting some planktons");
    }
    
    @Override
    public void panic_and_run(){
        System.out.println("The catfish is swimming away from the shark");
    }
}
