package com.me;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    public void messyMethod(){
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Even: " + number);
                int n2 = number * 2;
                System.out.println("Double: " + n2);
                if (n2 > 5) {
                    System.out.println("Over Five: " + n2);
                    //break;
                }
            }
        }
    }

    public void longMethod(){
        List<Integer> l1 = new ArrayList<Integer>();
        for (int n : numbers) {
            if (isEven(n)){
                l1.add(n);
                System.out.println("Even: " + n);
            }
        }

        List<Integer> l2 = new ArrayList<Integer>();
        for (int n : l1) {
            System.out.println("Double: " + n);
            l2.add(doubleIt(n));
        }

        List<Integer> l3 = new ArrayList<Integer>();
        for (int n : l2) {
            if (isGreaterThan5(n)) {
                l3.add(n);
                System.out.println("Over Five: " + n);
                break;
            }
            }
    }

    public void cleanEfficentStream(){
        System.out.println("Over Five :" +
                numbers.stream()
                        .filter((n) -> isEven(n))
                        .peek((n)-> System.out.println("Even: " + n))
                        .map(this::doubleIt)
                        .peek((n)-> System.out.println("Double :" + n))
                        .filter(this::isGreaterThan5)
                        .findFirst().get()
        );
    }

//Helper Methods

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int doubleIt(int number) {
        return number * 2;
    }

    public boolean isGreaterThan5(int number) {
        return number > 5;
    }

}
