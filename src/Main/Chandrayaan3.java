package Main;

import java.util.Scanner;

public class Chandrayaan3 {
    private int x, y, z;
    private String direction;

    public Chandrayaan3(int initialX, int initialY, int initialZ, String initialDirection) {
        x = initialX;
        y = initialY;
        z = initialZ;
        direction = initialDirection;
    }

    public void moveForward() {
        switch (direction) {
            case "N" -> y++;
            case "S" -> y--;
            case "E" -> x++;
            case "W" -> x--;
            case "U" -> z++;
            case "D" -> z--;
        }
    }

    public void moveBackward() {
        switch (direction) {
            case "N" -> y--;
            case "S" -> y++;
            case "E" -> x--;
            case "W" -> x++;
            case "U" -> z--;
            case "D" -> z++;
        }
    }

    public void executeCommands(String[] commands) {
        for (String cmd : commands) {
            switch (cmd) {
                case "f" -> moveForward();
                case "b" -> moveBackward();
                case "l" -> turnLeft();
                case "r" -> turnRight();
                case "u" -> turnUp();
                case "d" -> turnDown();
            }
        }
    }

    public void printFinalState() {
        System.out.println("Final Position: (" + x + ", " + y + ", " + z + ")");
        System.out.println("Final Direction: " + direction);
    }


    public static void main(String[] args) {
        int initialX = 0, initialY = 0, initialZ = 0;
        String initialDirection = "N";

        String[] commands = {"f","r","u","b","l"};

        Chandrayaan3 chandrayaan = new Chandrayaan3(initialX, initialY, initialZ, initialDirection);
        chandrayaan.executeCommands(commands);
        chandrayaan.printFinalState();
    }
}

