package HomeWork7.OutOfMemory;

import HomeWork7.ExceptionHandling;

public class OutOfMemoryErrorExample3 {
    private final static int size = 1000000000;

    public static void main(String[] args) {
        try {
            for (int i = 0; ; i++) {
                OutOfMemoryErrorExample3[] out = new OutOfMemoryErrorExample3[size];
            }
        } catch (OutOfMemoryError e) {
            ExceptionHandling.isProcessing(e);

        }

    }
}
