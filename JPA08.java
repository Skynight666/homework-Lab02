import java.util.Scanner;
public class JPA08 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Input:");
            int gra = scn.nextInt();
            if (gra>=90) {
                System.out.print("Your grade is A");
                System.out.println();
            } else if (gra>=80) {
                System.out.print("Your grade is B");
                System.out.println();
            } else if (gra>=70) {
                System.out.print("Your grade is C");
                System.out.println();
            } else if (gra>=60) {
                System.out.print("Your grade is D");
                System.out.println();
            } else {
                System.out.print("Your grade is F");
                System.out.println();
            }
        }
    }
}
