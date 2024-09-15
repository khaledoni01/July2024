package examples;

//3. Write a program which will print out default values of primitive data
//        types.
public class Day3 {

    // instance variable
    String name;
    String greeting;
    int age;

    // constructor
    public Day3(String value1, String value2, int val3){
        name = value1;
        greeting = value2;
        age = val3;
    }

    public static void main(String[] args) {

        Day3 d3 = new Day3("Maria", "Good Morning, ", 29);

        System.out.println(d3.greeting + d3.name);

        System.out.println("Age: " + d3.age);

    }


}
