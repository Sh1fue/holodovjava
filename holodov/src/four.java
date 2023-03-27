import java.util.Scanner;
public class four {
    public static void main(String args[]) {
        System.out.println("Числа которые кратны 3 ");
        for (int i=1;i<100;i++) {
            if (i%3==0)
                System.out.print(i+ ",");
        }
        System.out.println("");
        System.out.println("Числа которые кратны 5");
        for (int i=1;i<100;i++){
            if (i%5==0)
                System.out.print(i+ ",");
        }
        System.out.println("");
        System.out.println("Числа которые кратны 3 и 5");
        for (int i=1;i<100;i++) {
            if (i %3 == 0 && i%5==0)
                System.out.print(i + ",");
        }
    }
}
