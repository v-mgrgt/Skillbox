public class Main {

    public static void main(String[] args) {
        System.out.println("СВЕДЕНИЯ О СИСТЕМЕ");
        System.out.print("Операционная система: ");
        System.out.println(System.getProperty("os.name"));
        System.out.print("Количество процессоров, доступных JVM: ");
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.print("Объем памяти, доступной JVM: ");
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + " Мб");
    }
}
