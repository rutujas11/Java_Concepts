class InheritanceVehicle {
    protected String brand = "Ford";    //protected can be accessed by subclasses only
    public void honk(){
        System.out.println("\n\nTuut Tuut! This is superclass");
    }
}

class Car extends InheritanceVehicle{    // to show inheritance use "extends" word
    private final String model = "Mustang";
    public static void main(String[] args){
        Car mycar = new Car();    //create object of superclass only, it can also access the methods (public, protected) from superclass
        mycar.honk();    //calling function from superclass
        System.out.println("This is brand from superclass: "+ mycar.brand +" and this is model from subclass car: "+mycar.model);
    }
}

//NOTE : if you don't want other classes to inherit from the class use final keyword