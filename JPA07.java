import java.util.Scanner;
public class JPA07 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("請輸入三個整數:");
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
            int n3 = scn.nextInt();
            double maxn = Math.max(Math.max(n1, n2), n3);
            if (n1>0 && n2>0 && n3>0 && n1+n2>n3 && n2+n3>n1 && n1+n3>n2) {
                if (Math.pow(n1,2) + Math.pow(n2,2) == Math.pow(maxn,2) || Math.pow(n1,2) + Math.pow(n3,2) == Math.pow(maxn,2) || Math.pow(n2,2) + Math.pow(n3,2) == Math.pow(maxn,2)) {
                    System.out.print("直角三角形");
                    System.out.println();
                } else if (Math.pow(n1,2) + Math.pow(n2,2) < Math.pow(maxn,2) || Math.pow(n1,2) + Math.pow(n3,2) < Math.pow(maxn,2) || Math.pow(n2,2) + Math.pow(n3,2) < Math.pow(maxn,2)) {
                    System.out.print("鈍角三角形");
                    System.out.println();
                } else {
                    System.out.print("銳角三角形");
                    System.out.println();}
            } else {
                System.out.print("不可以構成三角形");
                System.out.println();
            }
        }
    }
}
