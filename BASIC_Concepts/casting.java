public class casting {
    public static void main(String[] args){
        int price = 100;
        int finalp = price+18;
        System.out.println("\nAddition of all ints: "+finalp);

        //with different datatypes ( where we required casting to make all variable of same type)
        int cost = 100;
        // int finalcost = cost+18.18    this line will give error as cost is int and we are trying to add double number(18.18) in it so we need to change 18.18 to int
        int finalcost = cost + (int) 18.18;    // op --> 100 + 18 = 118
        System.out.println("Addition after type casting: "+finalcost);

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        // Final keyword for constants
        //float pi = 3.14F;
        float pi = 11.1f;
        System.out.println("Without Final keyword pi value after changing: "+pi);

        final float Pi = 3.14f;
        //Pi = 1.11;   it shows the error "cannot assign a value to final variable Pi(errors(1): 21:9-21:19)"
        System.out.println("With final keyword value of pi: "+Pi);


    }
}
