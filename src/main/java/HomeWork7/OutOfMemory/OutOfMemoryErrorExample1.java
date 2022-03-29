package HomeWork7.OutOfMemory;

import HomeWork7.ExceptionHandling;

import java.util.ArrayList;


public class OutOfMemoryErrorExample1 {

    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList();
            list.add("роза"); // 0
            list.add("лоза"); // 1
            list.add("лира"); // 2
            list = fix(list);

            for (String s : list) {
                System.out.println(s);
            }
        } catch (OutOfMemoryError e) {
            ExceptionHandling.isProcessing(e);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < (list.size() - 1); i++) {
            if (list.get(i).contains("р") && list.get(i).contains("л"))
                continue;
            if (list.get(i).contains("р"))
                list.remove(i);
            if (list.get(i).contains("л")) {
                String s = list.get(i);
                list.add((i + 1), s);
            }
        }

        return list;
    }
}
