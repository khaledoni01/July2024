package org.example;

public class Day7 {


//  Write a loop which will run from 1 to 10 and increment it by 1
//ii. Skip/continue when number 5 is found.
//Ex: print 1 2 3 4 6 7 8 9 10. Make sure 5 is not printed

    public static void main(String[] args) {

//        for(int i=1; i<=10; i++){
//
//            if(i==5) {
//                continue;
//            }
//
//            System.out.println(i);
//        }

        int i=1;
        while(i<=10) {

            if(i==5) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

    }
}
