
/**
 * Write a description of class AnimalActivity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class AnimalActivity
{
    public static void main() {
        
        Animal fish = new Fish();
        Animal duck = new Duck();
        Animal seal = new Seal();
        Animal fox = new Fox();
        Animal lion = new Lion();
        
        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        animals.add(fish);
        animals.add(duck);
        animals.add(seal);
        animals.add(fox);
        animals.add(lion);
        
        //for (int i = 0; i < 3; i++) {
        //    System.out.println(animals.get(i) + animals.get(i).say());
        //}
        
        for (Animal a : animals) {
            System.out.println(a + a.say());
            if (a instanceof Seal) {
                System.out.println(((Seal)a).play());
            }
            if (a instanceof Fox) {
                System.out.println(((Fox)a).play());
            }
            if (a instanceof Lion) {
                System.out.println(((Lion)a).play());
            }
        }
        
        //System.out.println(duck.toString() + duck.say());
        //System.out.println(fish.toString() + fish.say());
        //System.out.println(seal.toString() + seal.say());
    }
}
