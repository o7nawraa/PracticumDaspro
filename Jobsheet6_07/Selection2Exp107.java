package Jobsheet6_07;
import java.util.Scanner;
/**
 * Selection2Exp1StudentIDNumber
 */
public class Selection2Exp107 {
public static void main(String[] args) {
    Scanner input07 = new Scanner(System.in); 
    int year;
    System.out.print("Input year : ");
    year = input07.nextInt();
if (year%4 == 0){
    if (year%100 != 0) { 
        System.out.println("Leap year");
    } if (year%400 == 0){
        System.out.println("Leap year");
    } else if (year%100 == 0){
        System.out.println("Not a leap year");
    }
    } else 
    System.out.println("Not a leap year");
}
}