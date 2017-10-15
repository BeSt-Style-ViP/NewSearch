import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IntClass {

    private final static int N = 10;

    private static boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main() {
        String in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите " + N + " чисел для массива:");
        int[] buff = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("buff[" + i + "]: ");
            try {
                in = reader.readLine();
            } catch (Exception E) {
                in = "0";
                System.out.println(E.toString());
            }
            if (isDigit(in))
                buff[i] = Integer.parseInt(in);
            else
                i--;
        }

        Sort.Insert(buff);

        System.out.println(Arrays.toString(buff));

        for (; ; ) {
            System.out.println("Введите значение, которое требуется найти:");
            try {
                in = reader.readLine();
            } catch (Exception E) {
                in = "";
                System.out.println(E.toString());
            }
            if (!isDigit(in)) {
                System.out.println("Ошибка, введено не число");
                continue;
            }
            break;
        }
        int index = Search.binSearch(buff, Integer.parseInt(in));
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("Ничего не найдено");
        }
        index = Search.LineSearch(buff, Integer.parseInt(in));
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("Ничего не найдено");
        }
    }
}
