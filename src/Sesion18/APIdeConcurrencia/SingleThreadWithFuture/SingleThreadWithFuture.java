package Sesion18.APIdeConcurrencia.SingleThreadWithFuture;

import java.util.concurrent.*;

public class SingleThreadWithFuture {
    public static void main(String args[]) throws Exception{
        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            Runnable task1 = () -> System.out.println("Imprimiendo tarea");
            Future<?> result = service.submit(task1);
            System.out.println(result.get(10, TimeUnit.SECONDS)); // 30
        } catch (TimeoutException ex){
            System.out.println("no alcanzo el tiempo");
        } finally {
            if (service!=null){
                service.shutdown();
            }
        }
    }
}
