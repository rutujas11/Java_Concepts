import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        //1) If-Else
        System.out.println("\nEnter your age: ");
        int age = sc.nextInt();
        if (age>18){
            System.out.println("You can vote!");
        }
        else if(age<18){
            System.out.println("You can't vote!");
        }
        else{
            System.out.println("You can vote next year!");
        }

        System.out.println("enter a: ");
        int a = sc.nextInt();
        System.out.println("enter b: ");
        int b = sc.nextInt();
        if (a>50 && b>50){
            System.out.println("Both a and b are greater than 50!");
        }
        else if(a>50 || b>50 ){
            System.out.println("At least one is greater than 50!");
        }
        else{
            System.out.println("Both are smaller than 50!");
        }

        //2)Switch Case
        System.out.println("Enter the today's day: ");
        int day = sc.nextInt();
        switch(day){
            case 1 -> {
                System.out.println("It's a Monday");
                break;
            }
            case 2 -> {
                System.out.println("It's a Tuesday");
                break;
            }
            case 3 -> {
                System.out.println("It's a wednesday");
                break;
            }
            default -> {
                System.out.println("it is between thursday and sunday");
            }

               
        }
        
    }
    
}
