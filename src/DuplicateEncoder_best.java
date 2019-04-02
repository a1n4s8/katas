public class DuplicateEncoder_best {
    static String encode(String word){
        word = word.toLowerCase();
        String result = "";
        for(int i = 0 ; i < word.length(); ++i){
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }

//        public static void main(String[] args) {
//        System.out.println(encode("qaAabc"));
//    }
}
