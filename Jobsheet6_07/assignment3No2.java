import java.util.Scanner;
public class assignment3No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The day : ");
        String day = sc.nextLine();
        System.out.print("Book Category : ");
        String category = sc.nextLine();
        System.out.print("Amount of Book : ");
        int amountOfBook = sc.nextInt();
       
        if (day.equalsIgnoreCase("wednesday")) {
            if (category.equalsIgnoreCase("Dictionary") || category.equalsIgnoreCase("Novel")){
                if (category.equalsIgnoreCase("dictionary")){
                    if (amountOfBook<=2 && amountOfBook>0){
                        System.out.print("get 10% discount of dictionary");
                    } else if (amountOfBook>2) {
                        System.out.print("get 10% discount buy dictionary + 2% discount");
                    }
                } else if (category.equalsIgnoreCase("novel")){
                    if (amountOfBook<=3 && amountOfBook>0){
                        System.out.print("get 7% discount buy novel + 1% discount");
                    } else if (amountOfBook>3) {
                        System.out.print("get 7% discount buy novel + 2% discount");
                    }
                }
            } else if (amountOfBook>3){
                System.out.print("get 5% discount of another category");
            } else {
                System.out.print("no discount");
            }
        } else {
            System.out.print("no discount today");
        }
    }   
}

