
/**
 * Write a description of class Recursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recursion
{
    public static void main(String[] args) {
        sumUpto(5);

    }
    
    public static int sumUpto(int i) {
        //base case
        if(i == 1) {
            return i;
        }
        
        //reduction step
        else if(i > 1) {
            return i + sumUpto(i-1);
        }
        
        return 0;
    }
}
