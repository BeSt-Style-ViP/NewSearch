public class Sort {

    public static void bubble(int[] src) {
        for (int i = 0; i < src.length - 1; i++) {
            boolean cont = false;
            for (int x = 0; x < src.length - i - 1; x++) {
                if (src[x] > src[x+1]) {
                    int prevX = src[x];
                    src[x] = src[x+1];
                    src[x+1] = prevX;
                    cont = true;
                }
            }
            if (!cont)
                break;
        }
        return;
    }

    public static void bubble(String[] src) {
        for (int i = 0; i < src.length - 1; i++) {
            boolean cont = false;
            for (int x = 0; x < src.length - i - 1; x++) {
                if (src[x].compareTo(src[x+1]) > 0) {
                    String prevX = src[x];
                    src[x] = src[x+1];
                    src[x+1] = prevX;
                    cont = true;
                }
            }
            if (!cont)
                break;
        }
        return;
    }
    public static void Insert(int[] src){
        int[] tmp = src.clone();
        for (int y = 0; y < tmp.length; y++) {
            int min = tmp[0];
            int el = 0;
            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i] < min) {
                    min = tmp[i];
                    el = i;
                }
            }
            src[y]=min;
            tmp[el]=2147483647;
        }
    }
}
