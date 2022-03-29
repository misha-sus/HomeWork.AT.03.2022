package HomeWork7.OutOfMemory;

import HomeWork7.ExceptionHandling;

import java.util.ArrayList;


public class OutOfMemoryErrorExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 1;
        try {
            while (true) {
                arr.add(i++);
            }
        } catch (OutOfMemoryError e) {
            ExceptionHandling.isProcessing(e);
        }
    }
}
