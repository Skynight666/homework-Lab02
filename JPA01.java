import java.util.Scanner;
public class JPA01 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Please enter score:");
            int number = scn.nextInt();
            if (number >= 60) {
                System.out.println("You pass");
            } 
            System.out.println("End");
        }
    }
}
