package HomeWork7;

import java.util.Arrays;

public class ExceptionHandling {
    public static void isProcessing(Throwable e) {
        System.err.println(String.format("Ошибка - %s, сейчас узнаем откуда ноги растут", e));
        Arrays.stream(e.getStackTrace()).reduce((x, y) -> y).ifPresent(System.err::println);
    }
}
