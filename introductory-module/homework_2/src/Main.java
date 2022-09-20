public class Main {

    public static void main(String[] args) {
        System.out.println("СИСТЕМА РАСЧЕТА СТОИМОСТИ ТОПЛИВА");

        double price92Fuel = 45.4;
        double price95Fuel = 50.9;
        int maxFuelTankCapacity = 100;

        int fuelType = 95;
        int fuelTankCapacity = 55; // вместимость топливного бака

        double selectedFuelPrice = 0;
        if (fuelType == 92) {
            selectedFuelPrice = price92Fuel;
        } else if (fuelType == 95) {
            selectedFuelPrice = price95Fuel;
        } else {
            System.err.println("Указан неверный тип топлива.");
        }

        if (fuelTankCapacity < 1) {
            System.err.println("Указано малое количество топлива.");
            fuelTankCapacity = 0;
        } else if (fuelTankCapacity > maxFuelTankCapacity) {
            System.err.println("Указанное количество топлива превышает максимально допустимое.");
            fuelTankCapacity = maxFuelTankCapacity;
        }

        System.out.println("Цена выбранного топлива: " + selectedFuelPrice + " руб.");

        double totalPrice = selectedFuelPrice * fuelTankCapacity;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
    }
}
