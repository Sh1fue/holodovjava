/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.Scanner;
public class first
{
    public static void main(String[] args) {
        int dec = 2;
        double pi= 3.1415;
        System.out.println("Введите радиус");
        Scanner scan = new Scanner(System.in);
        float R = scan.nextFloat();
        System.out.println("Периметр равен " + dec*pi*R);
        System.out.println("Площадь равна " + pi*R*R);

    }
}
