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

    public void turnLeft(String prev) {
        prev = direction;
        switch (direction) {
            case "N", "U" -> direction = "W";
            case "S", "D" -> direction = "E";
            case "E" -> direction = "N";
            case "W" -> direction = "S";
        }
    }

    public void turnRight(String prev) {
        prev= direction;
        switch (direction) {
            case "N", "U" -> direction = "E";
            case "S", "D" -> direction = "W";
            case "E" -> direction = "S";
            case "W" -> direction = "N";
        }
    }

    public void turnUp(String prev) {
        if (direction.equals("D")){
            direction=prev;
        }else{
            direction="U";
        }
    }

    public void turnDown(String prev) {
        if (direction.equals("U")){
            direction=prev;
        }else{
            direction="D";
        }
    }

    public void executeCommands(String[] commands, String prev) {
        for (String cmd : commands) {
            switch (cmd) {
                case "f" -> moveForward();
                case "b" -> moveBackward();
                case "l" -> turnLeft(prev);
                case "r" -> turnRight(prev);
                case "u" -> turnUp(prev);
                case "d" -> turnDown(prev);
            }
        }
    }

    public void printFinalState() {
        System.out.println("Final Position: (" + x + ", " + y + ", " + z + ")");
        System.out.println("Final Direction: " + direction);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialX = 0, initialY = 0, initialZ = 0;
        System.out.println("Enter initial coordinates of the spacecraft: ");
        System.out.print("x: ");
        initialX = sc.nextInt();
        System.out.print("y: ");
        initialY = sc.nextInt();
        System.out.print("z: ");
        initialZ = sc.nextInt();
        System.out.println();

        String initialDirection = "N";
        System.out.print("Enter initial direction of the SpaceCraft: ");
        initialDirection = sc.next();
        System.out.println();

        int n=0;
        System.out.print("How many commands you want to enter? ");
        n = sc.nextInt();
        String[] commands = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Command "+ (i+1) + ": ");
            commands[i] = sc.next();
        }

        System.out.println();
        Chandrayaan3 chandrayaan = new Chandrayaan3(initialX, initialY, initialZ, initialDirection);
        chandrayaan.executeCommands(commands, initialDirection);
        chandrayaan.printFinalState();
    }
}

