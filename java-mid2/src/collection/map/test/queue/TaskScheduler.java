package collection.map.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {

    Queue<Task> currentTask = new ArrayDeque<>();

    public void addTask(Task task) {
        currentTask.offer(task);
    }

    public int getRemainingTasks() {
        return currentTask.size();
    }

    public void processNextTask() {
        Task task = currentTask.poll();
        if (task != null) {
            task.execute();
        }
    }
}
