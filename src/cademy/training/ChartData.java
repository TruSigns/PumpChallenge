package cademy.training;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ChartData {
    //lv22 double charts
    public String[] justChill = {"CanCan", "Cleaner", "Meteo5cience", "FFF22", "Wedding Crasher", "Hyponosis22", "Redline", "1950", "Monolith", "Just hold on", "Revolution", ""};
    //lv23 double charts
    private String[] timeToSuffer = {"Travel To Future", "Nililism", "Creed", "HTTP", "Cross Over", "Final Autition 2-1", "Love is a Danger Zone", "Gargoyle", "Broken Karma", "BS Explosion", "Windmill", "Prime Time", "Clematis", "Nyar", "Your Mind", "D&D", "Red Snow", "Stardream", "Crossing Delta", "Video Out C"};
    //lv24 double charts
    private String[] chooseDeath = {"la Cinq", "Gloria", "Vanish", "Harma", "Conflict", "Sarabande", "Bedlam", "Final Audition", "Achluoias", "FFF24", "Full moon", "Full moon FULL", "Annihilator", "Creed FULL", "BrainPower", "lolite", "Dement", "Destri", "Cross Soul", "TFTMN FULL", "Errorcode", "Dignity", "A Site De La Rue", "Trashy", "Paved Garden", "V3"};

    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    public void select() {


        do {
            System.out.println("Please choose from the following: \n 1. WalkInThePark(lv22 double charts) \n 2. timeToSuffer(lv23 Double Charts) \n 3. chooseDeath(lv24 double charts)");
            int select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.println("That's sorta weak, my dude... :");
                    chill();
                    break;
                case 2:
                    System.out.println("I see you:");
                    suffer();
                    break;
                case 3:
                    System.out.println("You decided to not B**** out. Here's your list:");
                    death();
                    break;
            }

        } while (true);


    }


    public void selectChallenge(String[] target) {

        Set<String> set = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            int r_int = r.nextInt(target.length - 1);
            String choice = (target[r_int]);
            if (!set.contains(choice)) {
                set.add(choice);
                System.out.println(choice);
            } else {
                i--;
                continue;
            }

        }

    }


    public void chill() {

        selectChallenge(justChill);


    }

    public void suffer() {

        selectChallenge(timeToSuffer);


    }

    public void death() {

        selectChallenge(chooseDeath);


    }


}
