import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("НАХОЖДЕНИЕ ПАР ПОЛОЖИТЕЛЬНЫХ ЦЕЛЫХ ЧИСЕЛ, "
                + "ПРОИЗВЕДЕНИЕ КОТОРЫХ РАВНО ВВЕДЕННОМУ ЗНАЧЕНИЮ");

        while (true) {
            System.out.print(System.lineSeparator()
                    + "Введите целое положительное число: ");
            int value = scanner.nextInt();
            if (value > 0) {
                for (int i = 1; i <= value; i += 1) {
                    for (int j = value; j >= 1; j -= 1) {
                        if (i * j == value) {
                            System.out.printf("%d * %d" + System.lineSeparator(),
                                    i, j);
                        }
                    }
                }
            }
        }
    }
}
