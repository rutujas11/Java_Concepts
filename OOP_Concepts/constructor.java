public class constructor {
    int x;
    int z;
    final float pi = 3.14F;   //defining final keyword (other concept not in constructor)

    public constructor(){   //default constructor(without any parameter)
        x = 9;
    }
    public constructor(int y){   //parameterized constructor(with parameter)
        z = y;
    }

    public static void main(String[] args) {
        constructor myobj1 = new constructor();
        constructor myobj2 = new constructor(7);
        System.out.println("\n\nThis is default constructor: "+myobj1.x);
        System.out.println("This is parameterized constructor: "+myobj2.z);

        //for final keyword concept
        constructor finalobj = new constructor();
        //finalobj.pi = 5;  (it will give error : "cannot assign a value to final variable pi(errors(1): 21:9-21:25)")
        System.out.println("This is constant value defined with final keyword : "+finalobj.pi);
    }
    
}
