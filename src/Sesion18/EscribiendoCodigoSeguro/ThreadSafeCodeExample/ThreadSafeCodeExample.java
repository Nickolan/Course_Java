package Sesion18.EscribiendoCodigoSeguro.ThreadSafeCodeExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeCodeExample {
    public static void main(String args[]) throws Exception{
        ExecutorService service = null;
        try{
            service = Executors.newFixedThreadPool(11);
            WorkersManager wm = new WorkersManager();
            for (int i=0; i<10; i++)
                service.submit(() -> wm.incrementAndReport());

            System.out.println("end");

        }finally {
            if (service!=null)
                service.shutdown();
        }
    }
}

class WorkersManager{
    private int workersCount = 0;
    protected void incrementAndReport(){
        System.out.println((++workersCount)+" ");
    }
}

