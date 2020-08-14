package com.me;

import java.util.*;
import java.util.function.Predicate;

public class Main {


    public static void main(String[] args) {
        Streams streamsSample = new Streams();
        Predicates predicatesSample = new Predicates();

        //Infelxible odds filtering method
        // List<Integer> resultList = predicatesSample.removeOdds();
        // for(Integer i : resultList){
        //     System.out.println(i);
        // }
        

        //Infelxible odds filtering method with Streams
        // List<Integer> resultList = predicatesSample.removeOddsWithStream();
        // for(Integer i : resultList){
        //     System.out.println(i);
        // }

        //Flexible filtering method to filter anything!
        Predicate<Integer> removeOdds = n -> n%2 == 0;
        List<Integer> resultList = predicatesSample.removeAnything(removeOdds);
        for(Integer i : resultList){
            System.out.println(i);
        }




        // A messy OOP solution
        //streamsSample.messyMethod();

        //A long OOP solution
        //streamsSample.longMethod();

        //A sexy functional streaming solution
        //streamsSample.cleanEfficentStream();
    }
}
