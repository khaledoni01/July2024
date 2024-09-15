package example;

// Parent  -  Super

//Create a private variable
//        ii. Use setter method to set the value
//        iii. Use getter method to get the value
//        iv. Access that variable in other class
public class Base {

    private String name = "John";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
