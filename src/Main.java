import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        if (s.hasNextInt()) {
            a = s.nextInt();
            if ((a % 2) == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }
        } else System.out.println("Некорректный ввод");
    }
}