import java.util.Scanner;
public class assignment3No3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("The brand name : ");
    String brand = sc.nextLine();
    System.out.print("Category : ");
    String category = sc.nextLine();
    System.out.print("Size : ");
    int size = sc.nextInt();

    if (brand.equalsIgnoreCase("Converse")) {
        if (category.equalsIgnoreCase("slip on")) {
            if (size >= 36){
                if (size <=40 ) {
                    System.out.print("The amount shop total is Rp 800.000");  
                } else {
                    System.out.print("data invalid");
                }
            } else {
                System.out.print("data invalid");
            }
            
    } else if (category.equalsIgnoreCase("High top")) {
        if (size>=40){
            if (size<=44 ) {
                System.out.print("The amount shop total is 1.200.000");
            } else {
                System.out.print("data invalid");
            }
        } else {
            System.out.print("data invalid");
        }
    }
    } else if (brand.equalsIgnoreCase("sketcher")) {
        if (category.equalsIgnoreCase("woman")) {
        if (size >=36) {
            if (size <= 41){
                System.out.print("The amount shop is 1.000.000");
            } else { 
                System.out.print("data invalid");
            }
       } else {
        System.out.print("data invalid");
       }

} else if (category.equalsIgnoreCase("man")) {
    if (size>=41){
        if (size<=44) {
            System.out.print("The amount shop is 1.800.000");
        } else {
            System.out.print("data invalid");
        }
    } else {
        System.out.print("data invalid");
    }
}
} else if (brand.equalsIgnoreCase("nike")) {
    if (category.equalsIgnoreCase("kids")) {
        if (size>=36) {
            if (size<=40){
                System.out.print("The amount shop is 750.000");
            } else {
                System.out.print("data invalid");
            }
        } else {
            System.out.print("data invalid");
        }
        } else if (category.equalsIgnoreCase("adult")){
            if (size>=40){
                if (size<=44){
                    System.out.print("The shop amount is Rp 1.500.000");
                } else {
                    System.out.print("data invalid");
                }
            } else {
                System.out.print("data invalid");
            }
        }
        
    } else {
        System.out.print("we cant find the data");
    }
}
}
