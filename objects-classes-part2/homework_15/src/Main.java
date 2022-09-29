public class Main {

    public static void main(String[] args) {
        Dimensions initialDimensions = new Dimensions(30, 5, 100);
        Cargo initialCargo = new Cargo(initialDimensions, 100, "г. Москва", "1N", true, false);
        System.out.println(initialCargo);
        System.out.println();

        Dimensions dimensions1 = initialDimensions.setWidth(40)
                .setHeight(6)
                .setLength(200);
        Cargo cargo1 = initialCargo.setDimensions(dimensions1);
        System.out.println(initialCargo);
        System.out.println(cargo1);
        System.out.println();

        Cargo cargo2 = initialCargo.setDeliveryAddress("г. Санкт-Петербург");
        System.out.println(initialCargo);
        System.out.println(cargo1);
        System.out.println(cargo2);
    }
}
