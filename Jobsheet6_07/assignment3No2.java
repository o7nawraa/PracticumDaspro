import java.util.Scanner;
public class assignment3No2 {
    public static void main(String[] args) {
        double discount;
        int total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Book Category : ");
        String category = sc.nextLine();
        System.out.print("Amount of Book : ");
        int amountOfBook = sc.nextInt();
        System.out.print("Price of The Book : ");
        int bookPrice = sc.nextInt();

        if (category = "Dictionary"){
            {discount = 0.1;
            }else if(amountOfBook>2){
                discount = 0.2;
            total =(int) (bookPrice-(bookPrice*discount));
            System.out.println("Total : " + total);
            } else if (category= "Novel"){
                discount=0.7;
            } else if (amountOfBook>3){
                discount=0.2;
            } else
                discount=0.1;
            total =(int) (bookPrice-(bookPrice*discount));
            System.out.println("Total : " + total);
        } else {
            if (amountOfBook>3) {
                discount=0.5;
            total =(int) (bookPrice-(bookPrice*discount));
            System.out.println("Total : " + total);  
            } 
        }
    }   
}
