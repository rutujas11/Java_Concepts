public class StaticPublicMethods {
    static void mystatic(){
        System.out.println("\tThis is static method!, Can be called without creating object");
    }
    public void mypublic(){
        System.out.println("This is public method!, called using object");
    }

    public static void main(String[] args){
        StaticPublicMethods myobj = new StaticPublicMethods();
        myobj.mypublic();
        mystatic();
    }
}

