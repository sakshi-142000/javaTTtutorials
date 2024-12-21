package oopTrail;
import java.util.Scanner;

class LeaningClass
 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    boolean hasStudiedToday;
    Swagata s = new Swagata();
    System.out.println("has swagata studied today ?");
    hasStudiedToday=scan.nextBoolean();
    s.whatTypeOfPersonisSwagataToday(hasStudiedToday);
    s.WhoisSwagatasBestFriend();
    scan.close();
    
    }
}

class Swagata{
    
    private String bestFriend = "Sakshi"; 
    
    void whatTypeOfPersonisSwagataToday(boolean hasStudiedToday){
        if(hasStudiedToday == true) {
            System.out.println("Best version of her");
        }else{
            System.out.println("Swagata is backchod");
        }
    }

    void WhoisSwagatasBestFriend(){
        System.out.println("She has one and only best friend :" + bestFriend);
    }





    

}
