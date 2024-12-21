//package oopTrail;

/**
 * InnerFriend
 */
interface InnerFriend {
    boolean isBestFriend();
    void isCloseToMarriage();
    
    
}

public class Friend implements InnerFriend {
    String Name;
    int age;
    String gender; 
    Boolean isBoyfriend;
    int salary;

    public boolean isBestFriend(){
        if(this.Name =="Swagata") {
            System.out.println("My best friend :) ");
            return true;
        }
        else return false;
    }

    public void isCloseToMarriage(){
        if(this.age >= 25) System.out.println("Shadi kr le re baba  " + this.Name);
        else if (this.isBoyfriend == true) System.out.println("Mauja hi mauja");
        else System.out.println("Wasting life, chu chu chu");
    }

    void BoyfriendChance(String isIntrested){
        if (isIntrested == "Yes" && this.gender == "Male" && this.Name!="Agat Pareek"){
            System.out.println("this is your chance to hit, fyi, salary "+ this.salary);

        } 

        if(this.Name == "Agat Pareek"){
            System.out.println("Please stay back, tharki launda");
        }
        
        if (isIntrested == "No"){
            System.out.println("Better luck, next time");
        }
    }


}
