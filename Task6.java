package laba12;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task6 {
    public static int sumArray(int[] array) {
        int cores = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(cores);
        Future<Integer>[] futures = new Future[cores];

        final int chunkSize = array.length / cores;

        for (int i = 0; i < cores; i++) {
            final int start = i * chunkSize;
            final int end = (i == cores - 1) ? array.length : (i + 1) * chunkSize;
            futures[i] = executor.submit(() -> {
                int sum = 0;
                for (int j = start; j < end; j++) {
                    sum += array[j];
                }
                return sum;
            });
        }

        int totalSum = 0;
        for (int i = 0; i < cores; i++) {
            try {
                totalSum += futures[i].get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        return totalSum;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        int sum = sumArray(array);
        //
        System.out.println("Максимальный элекмент: " + sum);
    }
}
