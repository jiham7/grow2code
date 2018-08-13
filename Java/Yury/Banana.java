class Banana extends Fruit {
    Boolean isRipe;
    
    Banana() {
        name = "Banana";
        cost = 2.00;
        color = "Yellow";
        isRipe = false;
    }
    
    void ripen() {
        color = "Brown";
        isRipe = true;
    }
    
    public boolean getIsRipe() {
        return isRipe;
    }
}