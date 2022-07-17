import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int initNum = 1;
        int finNum = 12;

        System.out.println("ВЫЧИСЛЕНИЕ ФАКТОРИАЛА");

        while (true) {
            System.out.printf(System.lineSeparator() + "Введите целое положительное число от %s по %s: ",
                    initNum, finNum);
            int value = new Scanner(System.in).nextInt();
            int result = 1;
            if (value >= initNum && value <= finNum) {
                for (int i = 1; i <= value; i += 1) {
                    result *= i;
                }

                System.out.printf("%d! = %d" + System.lineSeparator(),
                        value, result);
            }
        }
    }
}
