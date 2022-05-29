public class Main {

    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        int min = -1;       // минимальный возраст
        int middle = -1;    // средний возраст
        int max = -1;       // максимальный возраст

        if (vasyaAge < katyaAge) {
            min = vasyaAge;
            max = katyaAge;
        } else {
            min = katyaAge;
            max = vasyaAge;
        }

        if (min < mishaAge) {
            if (max < mishaAge) {
                middle = max;
                max = mishaAge;
            } else {
                middle = mishaAge;
            }
        } else {
            middle = min;
            min = mishaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }
}
