package HomeWork7.SteckOverFlow;

import HomeWork7.ExceptionHandling;


public class StackOverflowErrorExample1 {
    public void testStack() {
        this.testStack();
    }

    public static void main(String[] args) {
        try {
            StackOverflowErrorExample1 s = new StackOverflowErrorExample1();
            s.testStack();

        } catch (StackOverflowError e) {
            ExceptionHandling.isProcessing(e);
        }
    }
}
