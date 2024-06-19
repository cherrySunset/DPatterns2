package composite_strategy;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("src/main/resources/data/tasks.json")));
            JSONArray jsonArray = new JSONArray(content);

            TaskRepository repository = new TaskRepository();

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject json = jsonArray.getJSONObject(i);
                Task task = TaskFactory.createTask(json);
                repository.addTask(task);
            }

            Optional<Task> projectOpt = repository.findTaskByName("New Website");
            if (projectOpt.isPresent()) {
                Task project = projectOpt.get();
                project.execute();
            }

            repository.sortTasksByName();
            for (Task task : repository.getAllTasks()) {
                System.out.println(task.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
