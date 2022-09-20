public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Молоко", 70);
        basket.add("Кефир", 80, 1, 960);
        basket.print();
    }
}
