package JavaExam;

public class Elevator {
    private int currentFloor;

    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        if (minFloor >= maxFloor) {
            throw new IllegalArgumentException("Min floor should be less than max floor.");
        }
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.currentFloor = minFloor;
    }

    public Elevator(int maxFloor) {
        this(1, maxFloor);
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            throw new IllegalArgumentException("Target floor is out of the elevator's range.");
        }
        this.currentFloor = floor;
    }

    @Override
    public String toString() {
        return "[" + minFloor + ", " + maxFloor + "] -> " + currentFloor;
    }

    public static void main(String[] args) {
        Elevator elevator = new Elevator(2, 7);
        System.out.println(elevator);
        elevator.move(4);
        System.out.println(elevator);
    }
}