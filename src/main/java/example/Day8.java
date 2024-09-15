package example;

public class Day8 {
//    Write a method which takes an array of int
//    ii. Array can contain 3 values
//    iii. Add all the values
//    iv. Return the total.
//            Note: Use a loop to do it
//    Ex: arrayTotal({1, 2, 3}) // 6

    public int arrayTotal(int[] val){
        int total = 0;

        for(int i : val) {
            total = total + i; //  total = 0 + 20 = 20 ->> 20 + 20 = 40 ->> 40 + 30 = 70
            System.out.println(total);
        }

        return total;
    }

    public static void main(String[] args) {

        Day8 d8 = new Day8();

        int[] v = {20, 20, 30};
        int[] big = {100, 200, 300};

        System.out.println( d8.arrayTotal(big) );

    }
}
