
/**
 * Write a description of class Lion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lion extends Animal implements Fun
{
    public Lion() {}
    
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
