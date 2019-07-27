package com.me;

public class Main {


    public static void main(String[] args) {
        Streams example = new Streams();

        // A messy OOP solution
        example.messyEfficientMethod();

        //A Long OOP solution
        example.cleanInefficientMethod();

        //A sexy functional streaming solution
        example.cleanEfficentStream();
    }
}
