import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8)) {
            System.out.print("Укажите путь к папке с изображениями: ");
            File src = new File(scanner.nextLine().strip());

            System.out.print("Укажите папку для сохранения изображений: ");
            File dst = new File(scanner.nextLine().strip());

            int core = Runtime.getRuntime().availableProcessors();
            System.out.println("Количество процессоров, доступных виртуальной машине: " + core);

            File[] files = src.listFiles(File::isFile);
            if (files == null)
                throw new NullPointerException();

            File[][] manyFiles = new File[core][(int) Math.ceil(1.0 * files.length / core)];
            for (int i = 0, x = 0, y = 0; i < files.length; i++) {
                manyFiles[x][y] = files[i];
                if (x++ == core - 1) {
                    x = 0;
                    y++;
                }
            }

            for (File[] manyFile : manyFiles) {
                new Thread(new ImageResizer(manyFile, dst)).start();
            }
        }
    }
}
