import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        final int Head = 1;
        final int Tail = 2;
        int outcome = 0;
        int TotalOutcome= 0;

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of Flip");
        int Chance = Sc.nextInt();
        int Flip = (int)(Math.random() * 2);

        int i = 0;
        for (i = 0; i <= Chance; i++){
            if (Flip == 1){
                System.out.println("THe outcome is Head");
                outcome = 1;
            }else {
                System.out.println("THe outcome is Tail");
                outcome = 0;


            }
            TotalOutcome = outcome + TotalOutcome;
            int Percentage = TotalOutcome / Chance;
            System.out.println("Percentage is " + Percentage);
        }
    }
}
