package composite_strategy;

public class RupStrategy implements TaskStrategy {
    @Override
    public void execute() {
        System.out.println("Executing task using RUP methodology.");
    }
}
