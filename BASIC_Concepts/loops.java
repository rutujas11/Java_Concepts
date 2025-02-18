public class loops {
    public static void main(String[] args) {
        // 1) For Loop
        //// Simple Pyramid pattern
        System.err.println("\t");
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
        // 2) While Loop
        System.out.println("It's a while loop output");
        int n = 10;
        while(n>=0){
            System.out.println(n);
            n--;
            //Break statement
            if(n==5){
                n--;
                continue;
            }
            // Continue statement
            if(n==2){
                break;
            }
            
        }

        //3) Do While Loop
        System.out.println("It's a Do while loop output");
        int k = 0;
        do { 
            System.out.println(k);
            k++;
        } while (k<=10);

    }
    
}
