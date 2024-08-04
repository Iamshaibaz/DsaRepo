// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
Input: s = "aaabbbcccaaa"
Output: "a3b3c3a3"
*/
public class ConcatCount {
    public static void count(String str) {
        if (str == null) {
            return;
        }
        
        StringBuilder build = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                build.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        build.append(str.charAt(str.length() - 1)).append(count);
        
        System.out.println(build.toString());
    }

    public static void main(String[] args) {
        String str = "aaabbbcccaaa";
        count(str);
    }
}
