package com.me;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;



public class Predicates {

    private List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

    public void predicates(){
        //this.numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    }


    public List<Integer> removeOdds(){
        List<Integer> removedList = new ArrayList<>();
        for(Integer n : numberList) {
            if (n % 2 == 0) {
                removedList.add(n);
            }
        }
        return removedList;
    }

    public List<Integer> removeOddsWithStream() {
        return numberList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> removeAnything(final Predicate<Integer> predicate) {
        return numberList.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

}