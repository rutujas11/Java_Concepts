import java.util.Scanner;
public class input {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);   // creating object for taking input

        // 1)Int as input
        System.out.println("\nEnter your age: ");
        int age = sc.nextInt();
        System.out.println("your age is: "+age);
    
        // 2)Float as input
        System.out.println("Enter the temperature: ");
        Float temp = sc.nextFloat();
        System.out.println("current temperatur is: "+temp);

        // 3)String as input
        System.out.println("enter your name: ");
        String word = sc.next();
        System.out.println("This is word not sentence: "+word);    //even if you entered sentence as input it will only print first word(i.e token)

        //4)Whole sentence
        System.out.println("Enter your full name: ");
        String name = sc.nextLine();  //nextLine will print whole sentence that you entered
        System.out.println("this is my full name: "+name);

    }
}
