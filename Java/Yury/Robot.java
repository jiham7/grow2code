public class Robot {
    private String job;
    private int age;
    private Boolean needsRepair;
    
    public Robot() {
        job = "Robot";
        age = 0;
        needsRepair = false; 
    }
    public void start() {
        System.out.println("Robot started.");
    }
    
    public void work() {
        System.out.println("Robot working.");
    }
    
    public void stop() {
        System.out.println("Robot stopped.");
    }
}