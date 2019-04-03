public class CountingDuplicates {
    public static int duplicateCount(String text) {
        // Write your code here
        String[] arr = text.toLowerCase().split("");
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            String cur = arr[i];
            boolean isDupl = false;

            for (int j = 0; j < arr.length; j++) {
                if (!cur.equals("")) {
                    if (i != j) {
                        if (cur.equals(arr[j])) {
                            isDupl = true;
                            arr[j] = "";
                        }
                    }
                }
            }
            if (isDupl) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde"));
        System.out.println(duplicateCount("abcdea"));
        System.out.println(duplicateCount("indivisibility"));
    }
}

