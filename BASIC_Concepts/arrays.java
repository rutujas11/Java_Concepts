import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {
        System.out.println("\n");
        //-------1) declaration of 1D array---------
        // Using new 
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 86;
        marks[2] = 90;
        System.out.println("declaration with new: "+marks[1]); //op = 86

        // Without new
        int[] mark = {97,86,90};
        System.out.println("Declaration without new: "+mark[1]);  // op = 86

        // operations on array Using "Arrays" library
        //"import java.util.Arrays;" at the starting of code (outside main first class)
        // 1)length
        System.out.println("Length of array: "+marks.length);

        // 2) sorting
        System.out.println("Array element at 0th index before sorting: "+marks[0]);
        Arrays.sort(marks);
        System.out.println("Array element at 0th index after sorting: "+marks[0]);

        
        //--------2) Declaration of 2D array---------
        int[][] finalmarks = {{97,94,86}, {89,84,96}};
        System.out.println(finalmarks[0][0]);
        System.out.println(finalmarks[1][1]);
    }
}
