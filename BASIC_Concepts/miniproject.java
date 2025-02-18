import java.util.Scanner;
public class miniproject {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int mynumber = (int)(Math.random()*100);
        int userchoice;

        do{
            System.out.println("\nGuess my number: ");
            userchoice = sc.nextInt();

            if(userchoice == mynumber){
                System.out.println("WOOHOO...CORRECT NUMBER!!!");
                break;
            }
            else if(userchoice>mynumber){
                System.out.println("Your choice number is too LARGE!!!");
            }
            else{
                System.out.println("Your choice number is too SMALL!!!");
            }
        }while(userchoice >=0);

        System.err.println("My number was: "+mynumber);

    }
    
}
