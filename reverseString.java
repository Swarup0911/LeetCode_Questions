package LeetCode_Questions;

public class reverseString {
    public static String reverseword(String s){
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseword(s));
    }
}
