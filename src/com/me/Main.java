package com.me;

public class Main {


    public static void main(String[] args) {
        Streams exapmle = new Streams();

        // A messy OOP solution
        exapmle.messyEfficientMethod();

        //A Long OOP solution
        exapmle.cleanInefficientMethod();

        //A sexy functional streaming solution
        exapmle.cleanEfficentStream();
    }
}
