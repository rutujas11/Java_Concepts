abstract class Abstractmethod{
    public abstract void study();   //only declaration of abstract method, definition will in inherited (subclass) class 
}

class student extends Abstractmethod{   //student is subclass and Abstractmethod is superclass
    @SuppressWarnings("override")
    public void study(){
        System.out.println("\n\nThis is the definition of abstract method");
    }
}

@SuppressWarnings("unused")
class AbstractClass {
    public static void main(String[] args) {
        student myobj = new student();
        myobj.study();
   }
}
    
