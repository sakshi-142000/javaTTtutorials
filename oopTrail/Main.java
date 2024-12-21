//package oopTrail;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Friend f1 = new Friend();
        f1.Name = "Swagata";
        f1.age=26;
        f1.gender= "female";
        f1.salary=130000;
        f1.isBoyfriend= false;
        f1.BoyfriendChance("No");
        f1.isBestFriend();
        f1.isCloseToMarriage();

    }
  
}
