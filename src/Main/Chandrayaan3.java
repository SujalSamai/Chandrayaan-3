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


    public static void main(String[] args) {
        int initialX = 0, initialY = 0, initialZ = 0;
        String initialDirection = "N";

        String[] commands = {"f","r","u","b","l"};

        Chandrayaan3 chandrayaan = new Chandrayaan3(initialX, initialY, initialZ, initialDirection);
        chandrayaan.executeCommands(commands);
        chandrayaan.printFinalState();
    }
}

