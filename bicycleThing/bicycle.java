//package bicycleThing;

/**
 * Innerbicycle
 */
interface Innerbicycle {

    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
    void brake(int decrement);
    void printState();
}

public class bicycle implements Innerbicycle {

    int cadence;
    int speed;
    int gear = 6;

    public void changeCadence(int newValue){
        this.cadence = newValue;
    }

    public void changeGear(int newValue){
        this.gear = newValue;
    }
    
    public void speedUp(int increment){
        this.speed += increment;
    }
    public void brake(int decrement){
        this.speed-=decrement;
    }

    public void printState(){
        System.out.printf("gear %d , cadence %d, speed %d", gear, cadence, speed);
    }
}
