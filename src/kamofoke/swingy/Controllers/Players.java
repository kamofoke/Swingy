package kamofoke.swingy.Controllers;

//import com.kamofoke.swingy.model.Villians.Zoom;
import kamofoke.swingy.model.CreateHero.Asassian;
import kamofoke.swingy.model.CreateHero.Hero;
import kamofoke.swingy.model.CreateHero.HeroStats;
import kamofoke.swingy.model.CreateHero.Superman;
import kamofoke.swingy.model.Villians.Thinker;
import kamofoke.swingy.model.Villians.Zoom;
import kamofoke.swingy.model.Weapons.Armor;
import kamofoke.swingy.model.Weapons.Artifacts;
import kamofoke.swingy.model.Weapons.Helm;
import kamofoke.swingy.model.Weapons.Weapon;

import java.util.Random;

public class Players {
   public static Hero newPlayer(String hero, String player, HeroStats stats, Artifacts artifact){

            if (hero.equals("Superman")){
                return new Superman(player, stats, artifact);
            }
            else if (hero.equals("Assassian")){
                return new Asassian(player, stats, artifact);
            }
            else
                return null;
        }

        public static Thinker newVillian(Hero hero){
            Random random = new Random();
            int villian = random.nextInt(2) + 1;
            String artifact = Artifacts.randomiseArtifact();
            int level = 0, attack = 0, defense = 0, hitpoints = 0, experience = 0;

            if (villian == 1){
                if (artifact.equals("WEAPON")){
                    Weapon weapon = new Weapon("Weapon");
                    level = hero.getHeroStats().getLevel();
                    attack = 100 + weapon.getAttack();
                    defense = 100;
                    hitpoints = 100;
                    experience = 0;
                    return new Thinker(level, attack, defense, hitpoints, experience, weapon);
                }
                else if (artifact.equals("ARMOR")){
                    Armor armor = new Armor("Armor");
                    level = hero.getHeroStats().getLevel();
                    attack = 100;
                    defense = 100 + armor.getDefense();
                    hitpoints = 100;
                    experience = 0;
                    return new Thinker(level, attack, defense, hitpoints, experience, armor);
                }
                else if (artifact.equals("HELM")){
                    Helm helm = new Helm("Helm");
                    level = hero.getHeroStats().getLevel();
                    attack = 100 + helm.getHitPoints();
                    defense = 100;
                    hitpoints = 100;
                    experience = 0;
                    return new Thinker(level, attack, defense, hitpoints, experience, helm);
                }
            }
            else if (villian == 2){
                if (artifact.equals("WEAPON")){
                    Weapon weapon = new Weapon("Weapon");
                    level = hero.getHeroStats().getLevel();
                    attack = 100 + weapon.getAttack();
                    defense = 100;
                    hitpoints = 100;
                    experience = 0;
                    return new Thinker(level, attack, defense, hitpoints, experience, weapon);
                }
                else if (artifact.equals("ARMOR")){
                    Armor armor = new Armor("Armor");
                    level = hero.getHeroStats().getLevel();
                    attack = 100;
                    defense = 100 + armor.getDefense();
                    hitpoints = 100;
                    experience = 0;
                    return new Thinker(level, attack, defense, hitpoints, experience, armor);
                }
                else if (artifact.equals("HELM")){
                    Helm helm = new Helm("Helm");
                    level = hero.getHeroStats().getLevel();
                    attack = 100 + helm.getHitPoints();
                    defense = 100;
                    hitpoints = 100;
                    experience = 0;
                    return new Thinker(level, attack, defense, hitpoints, experience, helm);
                }
            }
            return null;
        }
}
