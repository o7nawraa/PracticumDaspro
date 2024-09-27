import java.util.Scanner;
public class PemilihanHariDenganIf07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int dayNumber;
        String dayType;
        System.out.print("Input the number of the day: ");
        dayNumber = sc.nextInt();
        if (dayNumber <= 5) {
            System.out.println( dayNumber + " is weekdays");
        } else if (dayNumber < 8){
            System.out.println( dayNumber + " is weekend");
        } else {
            System.out.println("invalid number");
    }
}
}
