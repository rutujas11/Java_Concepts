class add{
    int c = 0;
    public int addition(int n,int m){    //method outside main class and inside another (add) class 
        c = n+m;
        return c;
    } 
}

public class methods {
    /// Method Inside class 
    public static int product(int x,int y){      
            int res = x*y;
            return res;
        }
    public static void main(String[] args) {
        // calling method which is inside class
        System.out.println("\nMethod inside class");
        int multi = product(4,5);
        System.err.println("This is product: "+multi);

        //Calling method which is outside main class but inside another class "add"
        add obj = new add();   //create object of outside class
        System.out.println("Method outside main and inside add class");
        System.out.println("This is addion: "+obj.addition(4,5));        
    }
}
