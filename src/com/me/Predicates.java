package com.me;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;



public class Predicates {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    


    public List<Integer> removeOdds(){
        for(Integer n : numbers){
            if (n % 2 != 0){
                numbers.remove(n);
            }
        }
        return numbers;
    }









    public List<Integer> removeOddsWithStream(){
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
    }









    public List<Integer> removeAnything(Predicate<Integer> predicate){
        return numbers.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

}