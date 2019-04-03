import java.util.Arrays;

public class AreSame_best {
    public static boolean comp(final int[] a, final int[] b){
        return a != null && a.length == b.length && Arrays.equals(Arrays.stream(a).map(i -> i*i).sorted().toArray(), Arrays.stream(b).sorted().toArray());
    }

    //return
    // a != null
    // && a.length == b.length
    // && Arrays.equals(
    // Arrays.stream(a).map(i -> i*i).sorted().toArray(),
    // Arrays.stream(b).sorted().toArray()
    // );
}
