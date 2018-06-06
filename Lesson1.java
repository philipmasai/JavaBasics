package com.philip;

public class Lesson1 {//type psv. if you want to rename. highlight then right click and click refactor.or shift+f6
    public static void main(String[] args) {
        //variables =store data
        int age=18; //normal number
        double height=1.8; // any decimal number.You can use an double to store an integer.
        double size=0.0005;
        double weight=70;
        double result=age*height;

        System.out.println(result);
        System.out.println(size*height);
        //you cant declare a variable twice eg you cannot declare age=30; again unless its a continuation.
        String name= "william";
        String sentence="i just enrolled into a coding bootcamp";
        System.out.println(name +" " +sentence+"" + result); //if you are printing a variable ,you should not put it in quotes

        String many=name +" " +sentence+" " + result;

        System.out.println(many);
        boolean completed =true;





    }
}
