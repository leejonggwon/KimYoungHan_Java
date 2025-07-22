package collection.deque.test.queue;

public class ScheduleTest {
    public static void main(String[] args) {
        //낮에 작업을 저장, 등록해놓는다
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(new CompressionTask());
        scheduler.addTask(new BackupTask());
        scheduler.addTask(new CleanTask());

        //새벽 시간에 실행한다
        System.out.println("작업 시작");
        run(scheduler);
        System.out.println("작업 완료");
    }

    //작업을 수행
    private static void run(TaskScheduler scheduler) {
        while (scheduler.getRemainingTasks() > 0) { //남은 작업수가 없을 떄 까지 실행
            scheduler.processNextTask();            //작업실행 메서드
        }
    }
}
