public class Elevator {
    private final int minFloor;
    private final int maxFloor;
    private int currentFloor = 1;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    private void moveUp() {
        currentFloor += 1;
    }

    private void moveDown() {
        currentFloor -= 1;
    }

    public void move(int floor) {
        if (floor >= minFloor && floor <= maxFloor && floor != currentFloor) {
            if (floor > currentFloor) {
                while (floor != currentFloor) {
                    moveUp();
                    System.out.println("Текущий этаж: " + currentFloor);
                }
            } else {
                while (floor != currentFloor) {
                    moveDown();
                    System.out.println("Текущий этаж: " + currentFloor);
                }
            }
        } else {
            System.out.println("Ошибка ввода номера этажа");
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}
