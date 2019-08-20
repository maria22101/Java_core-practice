package strings;

public class StringImmutability {
    public static void main(String[] args) {

        String originalString = "Let us be bold!";

        String subString1 = originalString.substring(7, 8).toUpperCase() + originalString.substring(8);
        String subString2 = originalString.substring(7).toUpperCase();
        System.out.println(originalString);
        System.out.println(subString1);
        System.out.println(subString2);
    }
}
