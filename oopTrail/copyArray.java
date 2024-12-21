//import java.util.Scanner;
import java.util.Arrays;

class CopyArray{

    public static void main(String[] args){
        String[] sourceArray= { "mango", "pineapple", "chocolate", "lime", "vanilla", "scotch"};
        String[] destArray= new String[10];

        System.arraycopy(sourceArray, 1, destArray, 0, 4 );

        for(String s : destArray){
            System.out.println(s);
        }
        //copyOfRange() method

        String[] newDestArray = Arrays.copyOfRange(destArray, 0, 3); // this is static method, need to qualify it

        for(String s : newDestArray){
            System.out.println(s);
        }

        System.out.println(Arrays.toString(newDestArray));
    }
}