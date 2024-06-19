package composite_strategy;

public class SpiralStrategy implements TaskStrategy {

    @Override
    public void execute() {
        System.out.println("Executing task using Spiral methodology.");
    }
}
