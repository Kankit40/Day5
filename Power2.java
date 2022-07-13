import java.util.Scanner;

public class Power2 {
    public static void main(String[] args) {
        int i = 2;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the power");
        int Power = Sc.nextInt();
        int n = 0;

        for (n = 1; n <= Power; n++){
            int Answer = i * n;
            System.out.println(Answer);
        }
    }
}
