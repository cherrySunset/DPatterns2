package composite_strategy;

public class TestingTask extends Task{
    public TestingTask(String name, TaskStrategy strategy) {
        super(name, strategy);
    }
    @Override
    public void execute() {
        System.out.println("Executing testing task: " + name);
        strategy.execute();
        for (Task task : subtasks) {
            task.execute();
        }
    }
}
