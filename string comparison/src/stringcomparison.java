import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner imput1 = new Scanner(System.in);
        String a1 = imput1.nextLine();
        String a = "a";
        if (a1.equals(a)) {
            System.out.println("Succsess!!");
        } else {
            System.out.println("Desuccsess...");
        }
    }
}
