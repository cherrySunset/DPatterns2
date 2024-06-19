package composite_strategy;
import org.json.JSONObject;
public class TaskFactory {
    public static Task createTask(JSONObject json) {
        String type = json.getString("type");
        String name = json.getString("name");
        TaskStrategy strategy;

        switch (json.getString("strategy").toLowerCase()) {
            case "agile":
                strategy = new AgileStrategy();
                break;
            case "waterfall":
                strategy = new WaterfallStrategy();
                break;
            case "spiral":
                strategy = new SpiralStrategy();
                break;
            case "rup":
                strategy = new RupStrategy();
                break;
            default:
                throw new IllegalArgumentException("Unknown strategy type");
        }

        switch (type.toLowerCase()) {
            case "development":
                return new DevelopmentTask(name, strategy);
            case "testing":
                return new TestingTask(name, strategy);
            case "design":
                return new DesignTask(name, strategy);
            case "project":
                return new Project(name, strategy);
            default:
                throw new IllegalArgumentException("Unknown task type");
        }
    }
}
