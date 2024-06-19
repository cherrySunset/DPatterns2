package composite_strategy;

public class AgileStrategy implements TaskStrategy {

    @Override
    public void execute() {
        System.out.println("Executing task using Agile methodology.");
    }
}
