import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int maxNum = 100;
        final int randomValue = new Random(new Date().getTime()).nextInt(maxNum) + 1;
        final Scanner scanner = new Scanner(System.in);

        System.out.printf("УГАДАЙ ЧИСЛО ОТ 1 по %s" + System.lineSeparator(), maxNum);

        while (true) {
            System.out.print(System.lineSeparator() + "Введите целое положительное число: ");
            int value = scanner.nextInt();
            if (value > 0) {
                if (value == randomValue) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (value > randomValue) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
            }
        }
    }
}
