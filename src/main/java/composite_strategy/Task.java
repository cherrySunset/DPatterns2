package composite_strategy;
import java.util.ArrayList;
import java.util.List;

public abstract class Task {
    protected String name;
    protected TaskStrategy strategy;
    protected List<Task> subtasks = new ArrayList<>();

    public Task(String name, TaskStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public void addSubtask(Task task) {
        subtasks.add(task);
    }

    public void removeSubtask(Task task) {
        subtasks.remove(task);
    }

    public List<Task> getSubtasks() {
        return subtasks;
    }

    public abstract void execute();
}
