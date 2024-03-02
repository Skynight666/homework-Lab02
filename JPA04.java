import java.util.Scanner;
public class JPA04 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Input:");
            int num = scn.nextInt();
            if (num%5==0 && num%9==0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}


