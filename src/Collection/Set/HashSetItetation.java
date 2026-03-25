package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public class HashSetItetation {
    public static void main(String[] args) {
        Set<String> superPowers = new HashSet<>();

        //Heroes
        superPowers.add("Invisibility");
        superPowers.add("Mind Reading");
        superPowers.add("Teleportation");
        superPowers.add("Super Strength");
        superPowers.add("Time Travel");

        //Villains
        superPowers.add("Laser Vision");
        superPowers.add("Weather Manipulation");
        superPowers.add("Telekinesis");
        superPowers.add("Shape shifting");
        superPowers.add("Chaos Induction");

        for(String superPower : superPowers){
            System.out.println(superPower.toUpperCase());
        }
        Iterator<String> iterator = superPowers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
