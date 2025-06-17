public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        System.out.println("\nLista total de tarefas: " + taskList.getTotalTask());

        taskList.addTask("Tarefa 1");
        taskList.addTask("Tarefa 1");
        taskList.addTask("Tarefa 1");
        taskList.addTask("Tarefa 2");
        taskList.addTask("Tarefa 3");

        System.out.println("\nLista total de tarefas: " + taskList.getTotalTask());

        taskList.taskToRemove("Tarefa 1");
        System.out.println("\nLista total de tarefas: " + taskList.getTotalTask());

        taskList.getTaskDescriptions();
    }
}