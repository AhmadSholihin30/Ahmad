import java.util.Scanner;

public class userinput {
    public static void bot() {
        Scanner Scanner = new Scanner(System.in);

        int userInput = Scanner.nextInt();

        if (userInput ==1) {
            System.out.println("Order confirmed");
        }else if (userInput == 2) {
            System.out.println("info@sololearn.com");
        }else {
            System.out.println("Try again");
        }
        Scanner.close();
    }
    public static void main(String[] args) {
        bot();
    }
}