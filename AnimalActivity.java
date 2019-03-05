
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
        
        ArrayList animals = new ArrayList<Animal>();
        
        animals.add(fish);
        animals.add(duck);
        animals.add(seal);
        
        for (int i = 0; i < 3; i++) {
            System.out.println(animals.get(i).toString() + animals.get(i).say());
        }
        
        //System.out.println(duck.toString() + duck.say());
        //System.out.println(fish.toString() + fish.say());
        //System.out.println(seal.toString() + seal.say());
    }
}
