package strings;

public class StringLetterRemoval {

    static String removeLetter(String s, char ch) {
        return s == null ? null : s.replaceAll(Character.toString(ch), "");
    }

    public static void main(String[] args) {
        String str = "beautiful";
        System.out.println(removeLetter(str, 't'));
    }
}
