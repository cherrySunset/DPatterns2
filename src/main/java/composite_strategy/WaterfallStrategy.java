package composite_strategy;

public class WaterfallStrategy implements TaskStrategy {
    @Override
    public void execute() {
        System.out.println("Executing task using Waterfall methodology.");
    }
}
