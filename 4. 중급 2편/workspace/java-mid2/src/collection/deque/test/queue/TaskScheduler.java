package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {

    private Queue<Task> tasks = new ArrayDeque<>();

    public void addTask(Task task) {
        tasks.offer(task); //작업을 등록 한다
    }

    public int getRemainingTasks() {
        return tasks.size(); //남은 작업수
    }

    public void processNextTask() {
        Task task = tasks.poll(); //저장된 작업 하나 빼서 task에 저장
        if (task != null) {       // 저장된 값에 작업이 있으면
            task.execute();       // 꺼낸작업.execute 로 작업을 시행한다
        }
    }

}