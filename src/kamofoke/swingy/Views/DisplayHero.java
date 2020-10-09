package kamofoke.swingy.Views;

import java.util.Scanner;

public class DisplayHero {

    public static String WelcomePlayer() {
        System.out.println("Please enter Hero name to continue\n");
        String player = null;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            player = scanner.nextLine();
            player = player.trim();

            if (player.length() > 0) {
                String[] check = player.split("\\s");
                if (check != null)
                    player = String.join("_", check);
                break;
            } else
                System.out.println("Player name cannot be null, please enter your new hero");
        }
        return player;
    }

    public static int playerSetUp() {
        System.out.println("\n");
        System.out.println("######WELCOME TO SWINGY######\n\n" +
                "1. Create a new hero\n" +
                "2. Selected existing hero\n");

        int option = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.matches("\\s*[1-2]\\s*")) {
                option = Integer.parseInt(line);
                break;
            } else
                System.out.println("Invalid input. Try again.");
        }
        return option;
    }

    public static int printHeroSelection() {
        System.out.println("CHOOSE YOUR HERO CLASS \n\n" +
                "1. Assassian\n" +
                "2. Superman\n");

        int option = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.matches("\\s*[1-2]\\s*")) {
                option = Integer.parseInt(line);
                break;
            } else
                System.out.println("Invalid input. Please choose either one of the options below");
        }
        return option;
    }

    public static void printDirections() {
        System.out.println("\n\n###### SELECT DIRECTION ######\n\n" +
                "1. EAST\n" +
                "2. SOUTH\n" +
                "3. WEST\n" +
                "4. NORTH\n" +
                "5. Quit Game\n");
    }

}
