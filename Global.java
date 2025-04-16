/**
 * Write a description of class Global here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Global  
{
    // instance variables - replace the example below with your own
    static String currentCharacter;

    /**
     * Constructor for objects of class Global
     */
    public Global()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void setCurrentCharacter(String c)
    {
        // put your code here
        currentCharacter = c;
    }
    
    public static String getCurrentCharacter(){
        return currentCharacter;
    }
}
