/* Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
   - Inheritance lets us inherit attributes and methods from another class. 
   - Polymorphism uses those methods to perform different tasks. 
   - This allows us to perform a single action in different ways. */

class Animal {
    public void animalsound(){
        System.out.println("Animal makes sound");
    }
}
class pig extends Animal{
    @SuppressWarnings("override")
    public void animalsound(){           //method overloading(method with same name but different operation is used in inherited class)
        System.out.println("Pig says : Wee Wee :)");
    }
}
class dog extends Animal{
    @SuppressWarnings("override")
    public void animalsound(){
        System.out.println("Dog says : Bow Bow :)");
    }
}

@SuppressWarnings("unused")
class Polymorphism{
    public static void main(String[] args){
        Animal myanimal = new Animal();
        Animal mypig = new pig();   //In Polymorphism Creating objects of subclass using Superclass 
        Animal mydog = new dog();

        System.out.println("\n\nAnimal class method: ");
        myanimal.animalsound();

        System.out.println("\n\npig class method: ");
        mypig.animalsound();

        System.out.println("\n\ndog class method: ");
        mydog.animalsound();


    }
}
