package com.philip;

public class Lesson3 {
    public static void main(String[] args) {
        //BMI Calc
        double w=63;
        double h=1.88;
        double bmi=w/(h*h);

        System.out.println("Your body mass index is"+bmi);
        if (bmi<15)
        {
            System.out.println("very severely underweight");
    }
    else if(bmi>=15 && bmi<16)
    {
        System.out.println("Severely underweight");
        }
        else if(bmi>=16 && bmi<18.5)
        {
            System.out.println("Underweight");
        }
        else if(bmi>=18.5 && bmi<25)
        {
            System.out.println("Normal (healthy weight)");
        }
        else if(bmi>=25 && bmi<30)
        {
            System.out.println("Overweight");
        }
        else if(bmi>=30 && bmi<35)
        {
            System.out.println("Obese Class (Moderately Obese)");
        }
        else if(bmi>=35 && bmi<40)
        {
            System.out.println("Obese class II (Severely Obese)");
        }
        else if(bmi>=40 && bmi<45)
        {
            System.out.println("Obese class III(Very severely obese)");
        }
        else if(bmi>=45&& bmi<50)
        {
            System.out.println("Obese class IV(Morbidly obese)");
        }
        else if(bmi>=50 && bmi<60)
        {
            System.out.println("Obese class V(Super obese)");
        }
        else if(bmi>=60)
        {
            System.out.println("Obese class VI(Hyper obese)");
        }


        }
}






