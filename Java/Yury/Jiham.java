
/**
 * Write a description of class Jiham here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jiham
{
    // instance variables - replace the example below with your own
    public String name;
    public int age;
    public String favoriteFood;
    

    /**
     * Constructor for objects of class Jiham
     */
    public Jiham()
    {
        // initialise instance variables
        name = "Jiham";
        age = 23;
        favoriteFood = "sushi";
    }
    
    public Jiham(String n, int a, String f)
    {
        // initialise instance variables
        name = n;
        age = a;
        favoriteFood = f;
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    public String getFavoriteFood() 
    {
        return favoriteFood;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void changeName(String n)
    {
        name = n;
    }
    
    public int tenYearsFromNow()
    {
        return age + 10;
    }
    
    public String toString()
    {
        System.out.println("Hi. My name is " + getName() + "." + "I am " + Integer.toString(getAge()) + "years old. My favorite food is " + getFavoriteFood());
        return "Hi. My name is " + getName() + "." + "I am " + Integer.toString(getAge()) + "years old. My favorite food is " + getFavoriteFood();
    }
}
