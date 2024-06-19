package composite_strategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class TaskRepository {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    public Optional<Task> findTaskByName(String name) {
        return tasks.stream().filter(t -> t.getName().equals(name)).findFirst();
    }

    public void sortTasksByName() {
        tasks.sort((t1, t2) -> t1.getName().compareTo(t2.getName()));
    }
}
