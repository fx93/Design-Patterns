
public class Application {

    public static void main(String[] args) {

        // In prototype, understanding registry class is important
        Registry registry = new Registry();

        Batman batman1 = (Batman) registry.getHero(Character.BATMAN);
        System.out.println(batman1);
        batman1.setYear(1930);
        batman1.setVillain("Ras al Ghul");
        System.out.println(batman1);

        Batman batman2 = (Batman) registry.getHero(Character.BATMAN);
        System.out.println(batman2);


    }
}
