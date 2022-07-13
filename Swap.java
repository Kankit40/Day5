import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number1");
        int Num1 = Sc.nextInt();

        System.out.println("Enter Number 2");
        int Num2 = Sc.nextInt();

        int temp = 0;

        temp = Num1;
        Num1 = Num2;
        Num2 = temp;

        System.out.println("Number 1 is :" + Num1);
        System.out.println("Number 2 is " + Num2);


    }
}
