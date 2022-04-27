import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        int point = sc.nextInt();
        int amount = (point % 10) + (point / 10 % 10) + (point / 100);
        System.out.println("Сумма числа: " + amount);
    }
}
