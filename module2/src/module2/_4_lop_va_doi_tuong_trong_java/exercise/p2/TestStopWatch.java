package _4_lop_va_doi_tuong_trong_java.exercise.p2;

import java.util.Arrays;
import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {
        int[] arr = new int[100000];

        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = new Random().nextInt(50000);
        }


        System.out.println("Before sort");
        System.out.println(Arrays.toString(arr));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        selectionSort(arr);

        stopWatch.stop();

        long time = stopWatch.getElapsedTime();
        System.out.println("Time sort: " + time);

        System.out.println("After sort");
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int min_index = i;

            for (int j = i; j < length; j++) {
                if (arr[min_index] > arr[j])
                    min_index = j;
            }

            if (min_index != i) {
                int tmp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = tmp;
            }
        }
    }
}
