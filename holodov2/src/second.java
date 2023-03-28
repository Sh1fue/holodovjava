import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first =  num.nextInt();
        System.out.println(first);
        switch(first){
            case 1:
                for(int i=1; i<10; i++)
                    System.out.println("Метод мигания");
                break;
            case 2:
                System.out.println("Проверка первой лампочки");
                break;
            case 3:
                for (int i=1;i<10;i++)
                    System.out.println("Метод бегущей строки");
                break;
            case 4:
                System.out.println("Вывод гирлянды");
                break;
        }
    }
}
