public class DuplicateEncoder {
    static String encode(String word) {

        String[] array = word.toLowerCase().split("");
        StringBuilder stb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            boolean plag = false;
            String tmp = array[i];

            for (int j = 0; j < array.length; j++) {
                String str = array[j];
                if (i != j) {
                    plag = str.equals(tmp);
                    if (plag) {
                        break;
                    }
                }
            }

            if (plag) {
                stb.append(")");
            } else {
                stb.append("(");
            }
        }
        return stb.toString();
    }
//
//    public static void main(String[] args) {
//        System.out.println(encode("qaaabc"));
//    }
}
