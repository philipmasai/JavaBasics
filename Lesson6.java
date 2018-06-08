package com.philip;

public class Lesson6 {
public static void multiply(double a, int b){
    double result=a* b;
    System.out.println(result);
}
public static void area(){
    double a=22/7;
    double r= Math.pow(10,2);
    double result=a*r;

    System.out.println(result
    );

}

    public static void main(String[] args) {
        //Functions-
        System.out.println("I am close");
        double x=10;
        System.out.println(Math.sqrt(x));
        System.out.println(Math.pow(2,0.5));
        double z=89.67;
        System.out.println(Math.round(z));
        System.out.println(z);
        z=Math.round(z);
        System.out.println(z);
        //using=calling
       int result= Math.multiplyExact(5,10);
        System.out.println(result);
        int r=7;
        double v=4/3*22/7*Math.pow(r,3);
        System.out.println(v);

        //STRINGS Written in capital letter
        String k="This is Kenya";
        System.out.println(k.length());
        System.out.println(k.toUpperCase());
        String upper=k.toUpperCase();
        System.out.println(upper.isEmpty());
        System.out.println(upper.indexOf("K"));


       add();
       add();
       add();
       multiply(5.2,60);
       multiply(77, 78);
       multiply(3455, 78);
       multiply(7.925642, 78);
       area();



    }
    public static void add() {
        int result=  10+20;
        System.out.println(result);
    }
}
