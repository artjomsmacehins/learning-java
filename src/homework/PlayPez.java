package homework;

public class PlayPez {
    public static void main(String[] args) {
        PezDispenser pezDispenser = new PezDispenser("George", "Blue", "Peppa Pig");
        System.out.println(pezDispenser.toString());

        pezDispenser.amam();
        pezDispenser.zagruzka();
        System.out.println(pezDispenser.getCurrentCandies());
        pezDispenser.poelPoOdnojCandie(2);;
        System.out.println(pezDispenser.getCurrentCandies());

        pezDispenser.zagruzPoOdnojCandie(3);
        System.out.println(pezDispenser.getCurrentCandies());

    }
}
