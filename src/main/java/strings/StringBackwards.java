package strings;

public class StringBackwards {
    private String str;

    public StringBackwards(String str) {
        this.str = str;
    }

    void backwards(int indexTill) {
        if (indexTill != str.length() - 1) {
            backwards(indexTill + 1);
        }
            System.out.print(str.charAt(indexTill));
    }

    public static void main(String[] args) {
        StringBackwards sb = new StringBackwards("Maracuya");
        sb.backwards(0);
    }
}
