package Jobsheet6_07;
import java.util.Scanner;
public class Selection2Exp207 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner (System.in);
        int angle1, angle2, angle3, totalAngle;
        System.out.print("Input angle 1 : ");
        angle1 = input07.nextInt();
        System.out.print("Input angle 2 : ");
        angle2 = input07.nextInt();
        System.out.print("Input angle 3 : ");
        angle3 = input07.nextInt();
        totalAngle = angle1+angle2+angle3;

        if (totalAngle == 180) {
            if(angle1==90 || angle2==90 || angle3==90){
                System.out.println("Right triangle");
            } else if(angle1==angle2 && angle1==angle3){
                System.out.println("equilateral triangle");
            } else if (angle1==angle2) {
                System.out.println("isosceles triangle");
            } else if (angle1==angle3){
                System.out.println("isosceles triangle");
            } else if (angle2==angle3){
                System.out.println("isosceles triangle");
            }
        } else 
            System.out.println("Not a triangle");
    }
}
