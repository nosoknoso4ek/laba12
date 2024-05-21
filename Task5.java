package laba12;


import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task5 {

    public static int findMaxNum(int[] array) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Количество доступных ядер: " + cores);

        ExecutorService executor = Executors.newFixedThreadPool(cores);
        Future<Integer>[] futures = new Future[cores];

        final int SizeChunk = array.length / cores;

        for (int i = 0; i <cores; i++) {
            final int start = i * SizeChunk;
            final int end = (i == cores - 1) ? array.length : (i + 1) * SizeChunk;
            futures[i] = executor.submit(() -> {
                int max = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    if (array[j] > max) {
                        max = array[j];
                    }
                }
                return max;
            });
        }

        int globalMax = Integer.MIN_VALUE;
        for (int i = 0; i < cores; i++) {
            try {
                int maxInChunk = futures[i].get();
                if (maxInChunk > globalMax) {
                    globalMax = maxInChunk;
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        return globalMax;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        int max = findMaxNum(array);
        System.out.println("Максимальный элекмент: " + max);
    }
}