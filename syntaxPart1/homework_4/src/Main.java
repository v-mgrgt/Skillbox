public class Main {

    public static void main(String[] args) {
        int appleCount = 8;     // количество яблок,    шт.
        int eggsCount = 10;     // количество яиц,      шт.
        int milkAmount = 1000;  // количество молока,   мл.
        int oilAmount = 180;    // количество масла,    г.
        int saltAmount = 1000;  // количество соли,     г.
        int sugarAmount = 1000; // количество сахара,   г.

        if (milkAmount >= 1000
                && oilAmount >= 30
                && sugarAmount >= 15
                && saltAmount >= 4) {
            System.out.println("Блины");
        }

        if (eggsCount >= 2
                && saltAmount >= 2
                && milkAmount >= 250) {
            System.out.println("Омлет");
        }

        if (eggsCount >= 2
                && milkAmount >= 250
                && saltAmount >= 3
                && appleCount >= 4) {
            System.out.println("Яблочный пирог");
        }

        if (appleCount >= 5) {
            System.out.println("Яблочный сок");
        }
    }
}
