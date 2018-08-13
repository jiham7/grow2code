public class Fruit {
    protected String name;
    protected double cost;
    protected String color;
    
    Fruit() {
        name = "Fruit";
        cost = 1.00;
        color = "None";
    }
    
    public String getName() {
        return name;
    }
    
    public double getCost() {
        return cost;
    }
    
    public String getColor() {
        return color;
        
    }
}