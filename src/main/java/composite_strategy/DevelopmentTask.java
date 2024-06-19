package composite_strategy;

public class DevelopmentTask extends Task {
    public DevelopmentTask(String name, TaskStrategy strategy) {
        super(name, strategy);
    }
    @Override
    public void execute() {
        System.out.println("Executing development task: " + name);
        strategy.execute();
        for (Task task : subtasks) {
            task.execute();
        }
    }
}
