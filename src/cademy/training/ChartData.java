package cademy.training;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ChartData {
    //lv22 double charts
    public String[] walkInThePark = {"CanCan", "Cleaner", "Meteo5cience", "FFF22", "Wedding Crasher", "Hyponosis22", "Redline", "1950", "Monolith", "Just hold on", "Revolution", ""};
    //lv23 double charts
    private String[] timeToSuffer = {"Travel To Future", "Nililism", "Creed", "HTTP", "Cross Over", "Final Autition 2-1", "Love is a Danger Zone", "Gargoyle", "Broken Karma", "BS Explosion", "Windmill", "Prime Time", "Clematis", "Nyar", "Your Mind", "D&D", "Red Snow", "Stardream", "Crossing Delta", "Video Out C"};
    //lv24 double charts
    private String[] chooseDeath = {"la Cinq", "Gloria", "Vanish", "Harma", "Conflict", "Sarabande", "Bedlam", "Final Audition", "Achluoias", "FFF24", "Full moon", "Full moon FULL", "Annihilator", "Creed FULL", "BrainPower", "lolite", "Dement", "Destri", "Cross Soul", "TFTMN FULL", "Errorcode", "Dignity", "A Site De La Rue", "Trashy", "Paved Garden", "V3"};

    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    public void select(){

        System.out.println("Please choose from the following: \n 1. WalkInThePark(lv22charts) \n 2. timeToSuffer(lv23 Double Charts) \n 3. chooseDeath(lv24 double charts)");
        int select = sc.nextInt();

        switch (select){
            case 1:
                System.out.println("You have chosen chill and the following random charts are:");
                chill();
                break;
            case 2:
                System.out.println("I see you trying to sweat and chosen suffer. The following charts you will play are:");
                suffer();
                break;
            case 3:
                System.out.println("You decided to not B**** out. Here's your list:");
                death();
                break;
        }

    }


    public void chill(){

        Set<String> set = new HashSet<>();
        for(int i = 0 ; i < 4 ; i++){
            int r_int = r.nextInt(11);
            String chooseChill = (walkInThePark[r_int]);
            if(!set.contains(chooseChill)){
                set.add(chooseChill);
                System.out.println(chooseChill);
            }else{
                i--;
                continue;
            }


        }



        }


    public void suffer(){

        Set<String> set = new HashSet<>();
        for(int i = 0 ; i < 4 ; i++){
            int r_int = r.nextInt(19);
            String chooseSuffer = (timeToSuffer[r_int]);
            if(!set.contains(chooseSuffer)){
                set.add(chooseSuffer);
                System.out.println(chooseSuffer);
            }else{
                i--;
                continue;
            }


        }



    }

    public void death(){

        Set<String> set = new HashSet<>();
        for(int i = 0 ; i < 4 ; i++){
            int r_int = r.nextInt(26);
            String chosenDeath = (chooseDeath[r_int]);
            if(!set.contains(chosenDeath)){
                set.add(chosenDeath);
                System.out.println(chosenDeath);
            }else{
                i--;
                continue;
            }


        }



    }





}
