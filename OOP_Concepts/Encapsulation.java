/* The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
    - declare class variables/attributes as private
    - provide public get and set methods to access and update the value of a private variable */

//We can add above code in another file where file name will be person.java so that public class for that file will be personor we can just add person class here in same file

//person.java
/*class person {
    private String name;
    
    //getter
    public void setname(String newname){
        this.name = newname;
    }
    //setter
    public String getname(){
        return name;
    }
} */

public class Encapsulation {
      public static void main(String[] args) {
        person myobj = new person();
        System.out.println("\n\nCalling set and get method from person class.....");
        myobj.setname("John");
        System.out.println("name of person is: "+myobj.getname());
      }
    
}
