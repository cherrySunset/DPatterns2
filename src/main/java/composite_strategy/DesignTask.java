package composite_strategy;

public class DesignTask extends Task {
    public DesignTask(String name, TaskStrategy strategy) {
        super(name, strategy);
    }
    @Override
    public void execute() {
        strategy.execute();
        for (Task task : subtasks) {
            task.execute();
        }
    }
}
