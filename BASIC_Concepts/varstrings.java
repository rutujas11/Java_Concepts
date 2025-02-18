public class varstrings { 
    public static void main(String[] args){
        //System.out.println("\n");
        // TYPES Of Data
        // 1) PRIMITIVE DATA
        // byte age=30;
        // int phone = 123456678;
        // Long phone1 = 1234567893434L;
        // float pi = 3.14F;
        // char letter = '@';
        // boolean isadult = false;

        // 2)Non-Primitive
        String name = "Aman";
        System.out.println("Length of Aman is: "+name.length());
        // String friend = new String("Rajalakshmi");
        // System.out.println("Length of Friend is: "+friend.length());

    // OPERATIONS OF String
        // 1)Concatenate
        String s1 = "Akku";
        String s2 = "Aman";
        String s3 = s1+s2;
        String s4 = s1+" and "+s2;
        System.out.println("Concatenation 1: "+s3);
        System.out.println("Concatenation 2: "+s4);

        // 2)charAt
        System.out.println("Use of charAt: "+s1.charAt(2));   //op = k

        // 3)length()
        System.out.println("Length function on Akku: "+s1.length());   //op = 4

        // 4)replace(old, new)
        String r1 = "Rutuja";

        String r2 = r1.replace("u","i");
        System.out.println("replacement of u by i in rutuja: "+r2);

        String r3 = r1.replace("r","i");
        System.out.println("Case sensitive 1 : replacement of r by i in rutuja: "+r3);  //never replace, we have to enter "R" in place of "r"
        
        String r4 = r1.replace("R","i");
        System.out.println("Case sensitive 2 : replacement of R by i in rutuja: "+r4);  // iutuja

        // 5)Substring(Start, End(exclusive))
        String str = "Rutuja";
        System.out.println("substring method: "+str.substring(0,4)); //Rutu
    }
    
}
