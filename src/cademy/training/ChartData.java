package cademy.training;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ChartData {
    //lv22 double charts
    public String[] walkInThePark = {};
    //lv23 double charts
    private String[] timeToSuffer = {"Travel To Future", "Nililism", "Creed", "HTTP", "Cross Over", "Final Autition 2-1", "Love is a Danger Zone", "Gargoyle", "Broken Karma", "BS Explosion", "Windmill", "Prime Time", "Clematis", "Nyar", "Your Mind", "D&D", "Red Snow", "Stardream", "Crossing Delta", "Video Out C"};
    //lv24 double charts
    private String[] chooseDeath = {"la Cinq", "Gloria", "Vanish", "Harma", "Conflict", "Sarabande", "Bedlam", "Final Audition", "Achluoias", "FFF", "Full moon", "Full moon FULL", "Annihilator", "Creed FULL", "BrainPower", "lolite", "Dement", "Destri", "Cross Soul", "TFTMN FULL", "Errorcode", "Dignity", "A Site De La Rue", "Trashy", "Paved Garden", "V3"};

    Random r = new Random();


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
