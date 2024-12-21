//package bicycleThing;



public class main {
    public static void main(String[] args) {
        bicycle b1 = new bicycle();
        b1.cadence=78;
        b1.speed=30;
        
        b1.changeCadence(89);
        b1.brake(5);
        b1.speedUp(10);
        b1.printState();
    }
}
