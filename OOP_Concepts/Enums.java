/*- An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
  - To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. 
  - Note that they should be in uppercase letters 
*/

//basic usage of enums
public class Enums {
    enum level{
        LOW,
        Medium,
        HIGH
    }
    public static void main(String[] args) {
        level myobj = level.Medium;
        System.out.println("\n\n"+myobj);
    } 
}


//Enums are often used in switch statements to check for corresponding values:
/*enum Level {
    LOW,
    MEDIUM,
    HIGH
  }
  
public class Enums { 
    public static void main(String[] args) {
      Level myVar = Level.MEDIUM; 
                  
      switch(myVar) {
        case LOW -> System.out.println("\n\nLow level");
        case MEDIUM -> System.out.println("\n\nMedium level");
        case HIGH -> System.out.println("\n\nHigh level");
      }
    }
  }
*/