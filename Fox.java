
/**
 * Write a description of class Fox here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fox extends Animal implements Fun
{
    public Fox() {}
    
    public String toString() {
        return "What does the fox say? ";
    }
    
    public String say() {
        return "moo";
    }
    
    public String play() {
        return "The fox chases mice and digs holes!";
    }
}
