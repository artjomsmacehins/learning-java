package classroom;

public class PlayWIthObjects {
    public static void main(String[] args) {

        Animal barsik = new Animal();
        System.out.println(barsik.getName());

        barsik.setName("Barsik");
        barsik.setAge(2);
        barsik.setColor("Grey");
        System.out.println(barsik.getName());

        Animal leo = new Animal();
        leo.setName("Leo");
        leo.setAge(1);
        leo.setColor("Ginger");
        System.out.println(leo.getName());

        System.out.println(leo);
        System.out.println(barsik);

        barsik.walk();
        leo.walk();

        barsik.eat();
        leo.eat();

        //Create 2 onject
        //Update information

        Animal cat = new Animal();
        cat.setName("Mio");
        cat.setAge(3);
        cat.setColor("Black");

        Animal dog = new Animal();
        dog.setName("Rocket");
        dog.setAge(4);
        dog.setColor("White");

        System.out.println(cat);
        System.out.println(dog);
        cat.eat();
        dog.eat();
        cat.walk();
        dog.walk();


    }
}
