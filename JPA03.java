import java.util.Scanner;
public class JPA03 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Input an integer:");
            int num = scn.nextInt();
            if (num%2==0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }
    }
}
