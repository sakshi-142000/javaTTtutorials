//package javaTTtutorials;

class InstanceOfOperator {

    public static void main(String[] args){
        Parent obj1 = new Parent();
        Parent obj2 = new Child();
    
        System.out.println(obj1 instanceof Parent);
        System.out.println(obj1 instanceof Child);
        System.out.println(obj1 instanceof testInterface);
    
        System.out.println(obj2 instanceof Parent);
        System.out.println(obj2 instanceof Child);
        System.out.println(obj2 instanceof testInterface);
    
    

    }
        
}


/**
 *  
 */
interface testInterface{
    
}

//class Parent{}
class Parent implements testInterface{}
class Child extends Parent implements testInterface{}// redundant after we implemented the same iterface for parent class as well
