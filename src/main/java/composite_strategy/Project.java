package composite_strategy;

public class Project extends Task {
    public Project(String name, TaskStrategy strategy) {
        super(name, strategy);
}
    @Override
    public void execute() {
        System.out.println("Executing project: " + name);
        strategy.execute();
        for (Task task : subtasks) {
            task.execute();
        }
    }
}
