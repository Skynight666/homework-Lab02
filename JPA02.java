import java.util.Scanner;
public class JPA02 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Input:");
            int num = scn.nextInt();
            int num2 = scn.nextInt();
            if (num > num2) {
                System.out.println(num + " is larger than " + num2);
            } else {
                System.out.println(num2 + " is larger than " + num);
            }
        }
    }
}
