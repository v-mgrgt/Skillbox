public class Arithmetic {
    private final int var1;
    private final int var2;

    public Arithmetic(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public void sum() {
        System.out.printf("Сумма чисел %d и %d составляет %d" + System.lineSeparator(),
                var1, var2, (long) var1 + var2);
    }

    public void mult() {
        System.out.printf("Произведение чисел %d и %d составляет %d" + System.lineSeparator(),
                var1, var2, (long) var1 * var2);
    }

    public void max() {
        System.out.printf("Максимальное число - %d" + System.lineSeparator(),
                Integer.max(var1, var2));
    }

    public void min() {
        System.out.printf("Минимальное число - %d" + System.lineSeparator(),
                Integer.min(var1, var2));
    }

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(Integer.MAX_VALUE, 259);
        arithmetic.sum();
        arithmetic.mult();
        arithmetic.max();
        arithmetic.min();
    }
}
