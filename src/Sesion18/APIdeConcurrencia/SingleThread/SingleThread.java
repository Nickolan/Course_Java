package Sesion18.APIdeConcurrencia.SingleThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThread {
    public static void main(String args[]) throws Exception{
        ExecutorService service = null;
        Runnable task1 = () -> System.out.println("Imprimiendo tarea");
        try{
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(task1);
            System.out.println("end");
        } finally {
            if (service !=null){
                service.shutdown();

                System.out.println(service.isShutdown());
                System.out.println(service.isTerminated());
                //Thread.sleep(3);
            }
        }
    }
}
