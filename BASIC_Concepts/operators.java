
public class operators {
    public static void main (String args[]){
        int num = 1;
        System.out.println("\n"+ num);
        
        System.out.println("print number when ++ is after number: "+ num++);
        System.out.println("print number when ++ is after number: "+ num);
        System.out.println("print number when ++ before number: "+ ++num);

        // MATH FUNCTIONS
        System.out.println("Math function max: "+Math.max(5,6));
        System.out.println("Math function min: "+Math.min(5,6));
        System.out.println("Math function random forrange 0 to 1 (long): "+Math.random()); //returns random number from 0 to 1 it's in the format Long
        System.out.println("Random function converted to int from long: "+(int)(Math.random()));
        System.out.println("Random function range converted to 0-100: "+(int)(Math.random()*100));

    }
    
}
