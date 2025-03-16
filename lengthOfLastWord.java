package LeetCode_Questions;

public class lengthOfLastWord {
    public static int length(String s) {
        String str = s.trim();
        int count = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(length(s));
    }
}
