/*Nguyen_Anh_Trà_20215151*/
import java.util.Scanner;
public class Bai6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name ?");
        String strName = scanner.nextLine();
        System.out.println("How old are you ?");
        int age = scanner.nextInt();
        System.out.println("How tall are you ?");
        double height = scanner.nextDouble();
        System.out.println("Mr/Mrs " + strName + ", " + age + "years old. "
        + "Your height is " + height + ".");
    }
}
