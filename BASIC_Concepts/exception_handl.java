public class exception_handl {
    public static void main(String[] args){
        int[] marks = {97,95,93};
        try {
            System.out.println(marks[5]);
        } catch (Exception e) {
            System.out.println("\nException ---> Array index out of bound");
        }
        System.err.println("This is aman");
    }
    
}
