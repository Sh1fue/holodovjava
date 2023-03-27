import java.util.Scanner;
public class third {
    public static void main(String args[]) {
        int del, rem;
        String hexdec_num="";
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        del = in.nextInt();

        while (del > 0) {
            rem = del%16;
            hexdec_num = hex[rem] + hexdec_num;
            del = del/16;
        }
        System.out.print("Hexadecimal number is : "+hexdec_num+"\n");
    }
}