package Sesion18.ScheduledThreads_ThreadPools.ThreadPoolExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String args[]){
        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            service = Executors.newFixedThreadPool(3);
            Callable<String> task1 = () -> {Thread.sleep(5000);
                System.out.println("task1 finished"); return "result";
            };

            service.submit(task1);
            service.submit(task1);
            service.submit(task1);
            System.out.println("end");
        }finally {
            if (service!=null){
                service.shutdown();
            }
        }
    }
}
