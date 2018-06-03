package multithreading.basics1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThredsPool {
    public void work(){
        ExecutorService executorService = Executors.newFixedThreadPool(10); //Reczne wlacznie watkow
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Task(i));
        }
        executorService.shutdown();
    }
}
