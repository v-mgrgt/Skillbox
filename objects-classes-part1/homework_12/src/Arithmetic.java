public class Arithmetic {
    private final int var1;
    private final int var2;

    public Arithmetic(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public long sum() {
        return (long) var1 + var2;
    }

    public long mult() {
        return (long) var1 * var2;
    }

    public int max() {
        return Integer.max(var1, var2);
    }

    public int min() {
        return Integer.min(var1, var2);
    }

    public static void main(String[] args) {
        int var1 = Integer.MAX_VALUE;
        int var2 = 259;

        Arithmetic arithmetic = new Arithmetic(Integer.MAX_VALUE, var2);
        long sum = arithmetic.sum();
        long mult = arithmetic.mult();
        int max = arithmetic.max();
        int min = arithmetic.min();

        System.out.printf("Сумма чисел %d и %d составляет %d" + System.lineSeparator(), var1, var2, sum);
        System.out.printf("Произведение чисел %d и %d составляет %d" + System.lineSeparator(), var1, var2, mult);
        System.out.printf("Максимальное число - %d" + System.lineSeparator(), max);
        System.out.printf("Минимальное число - %d" + System.lineSeparator(), min);
    }
}
