import java.util.ArrayList;

/**
 * Created by h205p2 on 10/2/17.
 */

public class zoo {
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        //tigger.eat("meat");
        Bear pooh = new Bear("Pooh");
       // pooh.eat("fish");
        //pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        //rarity.eat("marshmallows");
        Giraffe gemma = new Giraffe ("Gemma");
        //gemma.eat("meat");
       //gemma.eat("leaves");
        Bee stinger = new Bee ("Stinger");
        //stinger.eat("ice cream");
        //stinger.eat("pollen");
        Zookeeper zoebot = new Zookeeper("Zoebot");
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(tigger);
        animals.add(pooh);
        animals.add(rarity);
        animals.add(gemma);
        animals.add(stinger);
        zoebot.feedAnimals(animals, "popcorn");
    }
}