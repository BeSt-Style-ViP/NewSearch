import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringClass {
    private final static int N = 10;

    public static void main() {
        String in; BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите " + N + " строк для массива:");
        String[] buff = new String[N];
        for (int i = 0; i < N; i++) {
            System.out.print("buff[" + i + "]: ");
            try {
                in = reader.readLine();
            } catch (Exception E) {
                in = "";
                System.out.println(E.toString());
            }
            buff[i] = in;
        }

        Sort.bubble(buff);

        System.out.println(Arrays.toString(buff));
    }
}
