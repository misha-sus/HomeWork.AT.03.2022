package HomeWork7.SteckOverFlow;

import HomeWork7.ExceptionHandling;


public class StackOverflowErrorExample2 {
    public static int i = 1;

    public static void recursivePrint(int num) {
        if (num == 0)
            return;
        else
            recursivePrint(++num);
    }

    public static void main(String[] args) {
        try {
            StackOverflowErrorExample2.recursivePrint(i);
        } catch (StackOverflowError e) {
            ExceptionHandling.isProcessing(e);
        }
    }
}
