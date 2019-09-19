package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Keyboard;
        Keyboard = new Scanner(System.in);
        String Name;
        Float Weight,Height;
        System.out.println("Hello, We are going to find your BMI. What is your name?");
        Name = Keyboard.nextLine();
        System.out.println("What is your weight in Pounds");
        Weight = Keyboard.nextFloat();
        System.out.println("What is your height in Inches?");
        Height = Keyboard.nextFloat();
        System.out.println(Name + "your BMI is "+((Weight*0.453592)/((Height*0.0254)*(Height*0.0254))));
        







    }
}
