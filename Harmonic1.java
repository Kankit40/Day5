import java.util.Scanner;

public class Harmonic1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Harmonic digit");
        double H = Sc.nextInt();
        System.out.println("Enter the final harmonic position");
        double N = Sc.nextInt();
        int i = 0;
        
        for (i=1; i <= N; i++){
            double Result = (H)/i;
            System.out.println(Result);
        }
    }
}
