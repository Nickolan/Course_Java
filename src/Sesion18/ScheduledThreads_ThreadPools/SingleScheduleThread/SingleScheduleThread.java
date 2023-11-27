package Sesion18.ScheduledThreads_ThreadPools.SingleScheduleThread;

import java.util.concurrent.*;

public class SingleScheduleThread {
    public static void main(String args[]) throws Exception{
        ScheduledExecutorService service = null;
        service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> {
            try{
                System.out.println("task1");
                Thread.sleep(2000);
            }catch (Exception e){

            }

        };
        Callable<String> call1 = () -> {return "result";};
        ScheduledFuture<?> r1 = service.schedule(task1, 10, TimeUnit.SECONDS);
        //ScheduledFuture<?> r2 = service.schedule(call1, 8, TimeUnit.SECONDS);

        //service.scheduleAtFixedRate(task1, 2, 3, TimeUnit.SECONDS);
        //service.scheduleWithFixedDelay(task1, 2, 3, TimeUnit.SECONDS);
        System.out.println("end");
    }
}
