
interface Vehicle {
    void changeGear(int newGear);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}


class Bicycle implements Vehicle {
    private int gear;
    private int speed;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    void printStatus() {
        System.out.println("Bicycle - Gear: " + gear + ", Speed: " + speed + ", Brakes applied");
    }
}


class Bike implements Vehicle {
    private int gear;
    private int speed;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    void printStatus() {
        System.out.println("Bike - Gear: " + gear + ", Speed: " + speed + ", Brakes applied");
    }
}


public class Main {
    public static void main(String[] args) {
        
        Bicycle bicycle = new Bicycle();
        Bike bike = new Bike();

        
        bicycle.changeGear(1);
        bicycle.speedUp(10);
        bicycle.applyBrakes(2);
        bicycle.printStatus();

        bike.changeGear(3);
        bike.speedUp(20);
        bike.applyBrakes(5);
        bike.printStatus();
    }
}
