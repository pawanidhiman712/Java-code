class Transport {
    void move() {
        System.out.println("Transport is moving");
    }

    void fuel() {
        System.out.println("Transport fuel is used");
    }
}

// Subclass Bus
class Bus extends Transport {
    
    void move() {
        System.out.println("Bus moves on road");
    }
}

// Subclass Train
class Train extends Transport {
    
    void move() {
        System.out.println("Train moves on tracks");
    }
}

// Subclass Aeroplane
class Aeroplane extends Transport {
    
    void move() {
        System.out.println("Aeroplane flies in air");
    }
}

public class Main {
    public static void main(String[] args) {
        Transport t;

        t = new Bus();
        t.move();
        t.fuel();

        t = new Train();
        t.move();
        t.fuel();

        t = new Aeroplane();
        t.move();
        t.fuel();
    }
}