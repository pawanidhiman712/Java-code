interface Vehicle {
    void start();
}

class Car implements Main5 {
    @Override
    public void start() {
        System.out.println("Car starts with key");
    }
}

class Scooty implements Main5 {
    @Override
    public void start() {
        System.out.println("Scooty starts with kick");
    }
}

public class Main4 {
    public static void main(String[] args) {

        // Using interface reference (BEST PRACTICE)
        Main5 v1 = new Car();
        Main5 v2 = new Scooty();

        v1.start();
        v2.start();
    }
}