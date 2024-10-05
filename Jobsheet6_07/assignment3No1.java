import java.util.Scanner;
public class assignment3No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3 : ");
        int num3 = sc.nextInt();


        if (num1 > num2) {
            if (num1 > num3) {
            System.out.print("Maximum number is num 1 : " + num1);
             } else {
            System.out.print("Maximum number is num 3 : " + num3);
            } 
        } else if (num2 > num3) {
        System.out.print("Maximum number is num 2 : " + num2);
        } else 
            System.out.println("maximum number is num3 : " + num3);
        } 
        }