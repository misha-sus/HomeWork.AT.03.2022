package HomeWork7.SteckOverFlow;

import HomeWork7.ExceptionHandling;

public class StackOverflowErrorExample3 {
    public StackOverflowErrorExample3(StackOverflowErrorExample3 stack) {
    }

    public static void main(String[] args) {
        try {
            stackOverflow();
        } catch (StackOverflowError e) {
            ExceptionHandling.isProcessing(e);
        }
    }

    public static StackOverflowErrorExample3 stackOverflow() {
        return new StackOverflowErrorExample3(stackOverflow());
    }
}
