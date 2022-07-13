import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int Num1 = Sc.nextInt();

        if (Num1 % 2 ==0){
            System.out.println("THe number is Even");
        }else
            System.out.println("The number is odd");
    }
}
