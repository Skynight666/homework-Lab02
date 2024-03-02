import java.util.Scanner;
public class JPA05 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter an integer:");
            int num = scn.nextInt();
            if (num%2==0 && num%3==0 && num%6==0) {
                System.out.println(num + "是2、3、6的倍數");
            } else if (num%2==0) {
                System.out.println(num + "是2的倍數");
            } else if (num%3==0) {
                System.out.println(num + "是3的倍數");
            } else {
                System.out.println(num + "不是2、3、6的倍數");
            }
        }
    }
}
