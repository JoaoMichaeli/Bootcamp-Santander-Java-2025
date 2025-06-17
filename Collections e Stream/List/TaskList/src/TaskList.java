import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private final List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description){
        taskList.add(new Task(description));
    }

    public void taskToRemove(String description){
        List<Task> taskToRemove = new ArrayList<>();
        for(Task t : taskList){
            if(t.getDescription().equalsIgnoreCase(description)){
                taskToRemove.add(t);
            }
        }
        taskList.removeAll(taskToRemove);
    }

    public int getTotalTask(){
        return taskList.size();
    }

    public void getTaskDescriptions(){
        System.out.println("\nDescrições das tarefas: " + taskList);
    }
}
