import java.util.Scanner;
public class CodeMeetingTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the Distance you want: ");
        double range = sc.nextDouble();
        if(range <= 5){
            System.out.println("use Melee weapons");
        }else{
            System.out.println("Use Ranged weapons");
        }
    }
}
