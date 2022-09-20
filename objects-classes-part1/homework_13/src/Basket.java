public class Basket {
    private static int counter = 0;
    private int limit = 1_000_000;
    private int totalPrice = 0;
    private double totalWeight = 0;
    private String items = "";

    public Basket() {
        ++Basket.counter;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = contains(name) || totalPrice + count * price >= limit;

        if (error) {
            System.out.println("Error occurred :(");
        } else {
            totalPrice += count * price;
            totalWeight += weight;
            items += name + " - " + count + " шт. - " + price + " у.е." + System.lineSeparator();
        }
    }

    public void add(String name, int price) {
        add(name, price, 1, 0);
    }

    public void clear() {
        totalPrice = 0;
        totalWeight = 0;
        items = "";
    }

    public boolean contains(String name) {
        return items != null && items.contains(name);
    }

    public void print() {
        System.out.println("Содержимое корзины:");
        if (items == null || items.isBlank()) {
            System.out.println("Ваша корзина пуста");
        } else {
            System.out.println(items);
        }
    }

    public int getLimit() {
        return limit;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public String getItems() {
        return items;
    }

    public static int getCounter() {
        return counter;
    }
}
