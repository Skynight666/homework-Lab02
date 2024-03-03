import java.util.Scanner;
public class JPA06 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Input Chinese score:");
            int ch = scn.nextInt();
            System.out.print("Input English score:");
            int en = scn.nextInt();
            System.out.print("Input Math score:");
            int ma = scn.nextInt();
            if (ch>=60 && en>=60 && ma>=60) {
                System.out.print("All pass.");
            } else {
                if (ch<60) {
                System.out.print("Chinese failed.");
                System.out.println();
            } 
                if (en<60) {
                System.out.print("English failed.");
                System.out.println();
            }  
                if (ma<60) {
                System.out.print("Math failed.");
                }
            }
            System.out.println();
        }
    }
}