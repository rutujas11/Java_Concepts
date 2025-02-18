/*An "interface" is a completely "abstract class" that is used to group related methods with empty bodies 
  - Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "first" object in the Interface class)
  - Interface methods do not have a body - the body is provided by the "implement" class
  - On implementation of an interface, you must override all of its methods
  - Interface methods are by default abstract and public
  - Interface attributes are by default public, static and final
  - An interface cannot contain a constructor (as it cannot be used to create objects)
*/


interface first{

    //Below code snippet will show the error "interface abstract methods cannot have body(errors(1): 2:5-2:33)" 
    //as interface methods are abstract methods 
    /*public void myFirstmethod(){
        System.out.println("This is first interface!!!");
    }*/ 
    public void myFirstmethod();
}
interface second{
    public void mySecondmethod();
}

class demo implements first,second{
    @Override
    public void myFirstmethod(){
        System.out.println("\n\nThis is first interface!!!");
    }
    @Override
    public void mySecondmethod(){
        System.out.println("This is second interface!!!");
    }
}
public class Interface {
    public static void main(String[] args) {
        demo myobj = new demo();
        myobj.myFirstmethod();
        myobj.mySecondmethod();
    }
}

/* When to use:
Java does not support "multiple inheritance" (a class can only inherit from one superclass). 
However, it can be achieved with interfaces, because the class can implement multiple interfaces. */