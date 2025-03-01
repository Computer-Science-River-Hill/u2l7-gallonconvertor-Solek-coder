package org.example; //DO NOT DELETE
import java.util.Scanner;
// Program Name: StepsPerDay
// Author: Aron Tekie
class Main {
  public static void main(String[] args) {
    Scanner gallon_input = new Scanner(System.in); 
    System.out.print("Enter the number of gallons: ");
    double gallons = gallon_input.nextDouble(); 
    double quarts = (gallons*4);
    double pints = (quarts*2);
    double cups = (pints*2);
    double tablespoons = (cups*16);
    System.out.println("In " + gallons + " gallons there are:");
    System.out.println(quarts + " quarts");
    System.out.println(pints + " pints");
    System.out.println(cups + " pints");
    System.out.println(tablespoons + " tablespoons");

}

}