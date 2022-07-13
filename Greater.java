import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number 1");
        int Num1 = Sc.nextInt();

        System.out.println("Enter the Number 2");
        int Num2 = Sc.nextInt();

        System.out.println("Enter the Number 3");
        int Num3 = Sc.nextInt();

        if (Num1 > Num2 && Num1 > Num3){
            System.out.println( Num1 + " is grater than " + Num2 +  " and " + Num3);
        } else if (Num2 > Num1 && Num2 > Num3) {

            System.out.println(Num2 + " is grater than " + Num1 +  " and " + Num3);
        }else
            System.out.println(Num3 + " is grater than " + Num1 +  " and " + Num2);
    }
}
