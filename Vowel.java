import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet");
        char Aplhabet = Sc.next().charAt(0);

        if (Aplhabet == 'a' || Aplhabet == 'e'|| Aplhabet == 'i' || Aplhabet == 'o' || Aplhabet == 'u'){
            System.out.println("THe alphabet is vowel");
        }else
            System.out.println("The number is consonant");
    }
}
