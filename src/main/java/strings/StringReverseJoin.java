package strings;

public class StringReverseJoin {
    public static void main(String[] args) {
        String s1 = "olleH";
        StringBuilder sb = new StringBuilder(s1).reverse();
        System.out.println(sb);

        sb.append(" World");
        System.out.println(sb);

        String s2 = "You are beautiful";
        String s3 = String.join("_", sb, s2);
        System.out.println(s3);
    }
}
