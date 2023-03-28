import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner num = new Scanner(System.in);
        int first = num.nextInt();
        System.out.println(num);
        if (first>=0 && first<=10) {
            System.out.println("Меньше 10");
        }
        else{
            System.out.println("");
            System.out.println("Больше 10");
        }
    }
}