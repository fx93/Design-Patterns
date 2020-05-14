
import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<Character, SuperHeroes> heroesMap = new HashMap<>();

    public Registry() {
        this.initialize();
    }

    public SuperHeroes getHero(Character character){

        SuperHeroes hero = null;
        try {
            hero = (SuperHeroes) heroesMap.get(character).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return hero;

    }

    private void initialize() {
        IronMan ironMan = new IronMan();
        ironMan.setActor("Robert Downey Jr");
        ironMan.setComics("Marvel");
        ironMan.setYear(1945);


        Batman batman = new Batman();
        batman.setComics("DC");
        batman.setVillain("Joker");
        batman.setYear(1918);

        heroesMap.put(Character.BATMAN, batman);
        heroesMap.put(Character.IRONMAN, ironMan);
    }
}
