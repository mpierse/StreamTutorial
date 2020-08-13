package com.me;

public class Main {


    public static void main(String[] args) {
        Streams streamsSample = new Streams();
        Predicates predicatesSample = new Predicates();

        //Infelxible odds filtering method
        //System.out.println(predicatesSample.removeOdds());

        //Infelxible odds filtering method with Streams
        //System.out.println(predicatesSample.removeOddsWithStream());

        //Flexible filtering method to filter anything!
        //System.out.println(predicatesSample.removeAnything(n -> n%2 != 0));




        // A messy OOP solution
        //streamsSample.messyMethod();

        //A long OOP solution
        //streamsSample.longMethod();

        //A sexy functional streaming solution
        streamsSample.cleanEfficentStream();
    }
}
