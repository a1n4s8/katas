import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (a == null)            return false;
        if (b == null)            return false;
        if (a.length != b.length) return false;

        int cnt = 0;
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
        for (int i = 0; i < b.length ; i++) {
            for (int j = 0; j < a.length ; j++) {
                if (b[i] == a[j] * a[j]) {
                    System.out.println(b[i] + " vs " +a[j]*a[j]);
                    a[j] = 0;
                    b[i] = 0;
                    cnt++;
                    break;
                }
            }
        }
        System.out.println("b : " + Arrays.toString(b));
        return cnt == b.length;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,2,3};
        int[] b = new int[]{4,9,9};


        System.out.println(comp(a, b));
    }
}
