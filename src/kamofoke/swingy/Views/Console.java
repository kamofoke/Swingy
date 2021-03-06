package kamofoke.swingy.Views;

import kamofoke.swingy.Files.ReadFile;
import kamofoke.swingy.Controllers.Controller;
import kamofoke.swingy.model.CreateHero.Hero;

import java.util.Scanner;

public class Console {
   public static void begin() {
        String player;
        int type, createHero, option = 0, play;
        Hero hero;

        try {
            createHero = DisplayHero.playerSetUp();

            if (createHero == 1) {
                player = DisplayHero.WelcomePlayer();
                type = DisplayHero.printHeroSelection();
                hero = StartGame.NewHero(player, type);
                play = HeroLevel.printDetails(type, player, hero);
                if (play == 1) {

                    Controller.run(hero);
                } else {
                    System.out.println("###### Its a pity you chose to leave, u would have enjoyed the game!!! #####\n\n");
                    System.exit(0);
                }
            }
            else if (createHero == 2) {
                ReadFile.getDBHeroes();
                Scanner scanner = new Scanner(System.in);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    int Countlines = ReadFile.getLinesCount();

                    if (isDigit(line) == true) {
                        try {
                            int index = Integer.parseInt(line);
                            if (index > 0 && index <= Countlines) {
                                option = index;
                                break;
                            }
                        }
                        catch (Exception e)
                        {
                            System.out.println("Invalid input. Try again.");
                        }
                    }
                    else
                        System.out.println("Invalid input. Try again.");
                }
                hero = StartGame.dbHero(ReadFile.getHero(option));
                Controller.run(hero);
            }
        }
        catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public static boolean isDigit(String line)
    {
        for (char c : line.toCharArray()){
            if (Character.isDigit(c) != true)
                return false;
        }
        return true;
    }

}
