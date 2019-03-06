
/**
 * Write a description of class Lion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;

public class Lion extends Animal implements Fun
{
    boolean canRoar; //constant
    boolean mane;
    boolean isWild;
    String color;
    int height; 
    String name;
    
    public Lion() {
        canRoar = true;
        mane = true;
        isWild = true;
        color = "orange";
        height = 48;
        name = "Simba";
    }
    
    public Lion(boolean r, boolean m, boolean w, String c, int h, String n) {
        canRoar = r;
        mane = m;
        isWild = w;
        color = c;
        height = h;
        name = n;
    }
    
        public String Roar(){
        return "Roar xd <3";
    }
    
    public String Hunt() {
        int Random;
        Random = (int)((Math.random() * 4) + 1);
        
        if (Random == 1) {
            return (name + " has hunted a zebra for today's meal.");
        }
        else if (Random == 2) {
            return (name + " has hunted a boar for today's meal.");
        }
        else if (Random == 3) {
            return (name + " has hunted a giraffe for today's meal.");
        }
        else {
            return (name + " has hunted a flamingo for today's meal.");
        }
    }
    
    public String Run() {
        return "After a good meal, " + name + " went for a run.";
    }
    
    public String Sleep() {
        return "Tired from today's activities " + name + " retired to its enclosure.";
    }
    
    public String nameTest() {
        return name;
    } 
    
    public String toString() {
        return "Lion says ";
    }
    
    public String say() {
        return "*rawr* XD";
    }
    
    public String play() {
        return "The lion went for a stroll.";
    }
}
