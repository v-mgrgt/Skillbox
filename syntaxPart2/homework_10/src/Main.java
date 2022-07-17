public class Main {

    public static void main(String[] args) {
        int volume = 1200;          // л
        int fillingSpeed = 30;      // л/мин
        int devastationSpeed = 10;  // л/мин

        int currentVolume = 0;      // л
        int fillingTime = 0;        // мин

        do {
            currentVolume += fillingSpeed;
            currentVolume -= devastationSpeed;
            fillingTime += 2;
        } while (currentVolume < volume);

        System.out.printf("Время наполнения бассейна с учётом скоростей наполнения и опустошения составляет %s мин.", fillingTime);
    }
}
