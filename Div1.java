import java.util.Scanner;

public class Div1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Divident");
        int Divident = Sc.nextInt();

        System.out.println("Enter Divisor");
        int Divisor = Sc.nextInt();

        int Quotient = (int)(Divident/Divident);
        int Reminder = Divident%Divisor;

        System.out.println("Quitient is :" + Quotient);
        System.out.println("Reminder is " + Reminder);


    }
}
