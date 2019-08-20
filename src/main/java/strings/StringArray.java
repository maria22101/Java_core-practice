package strings;

public class StringArray {
    static void printString (String s) {
        System.out.print(s + " ");
    }

    public static void main(String[] args) {

        String str1 = "A string in java is an object, not an array of chars!";
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i) + " ");
        }
        System.out.println();

        String str2[] = {"There", "can", "be", "arrays", "of", "strings", "!"};
        for (String s : str2)
            StringArray.printString(s);
        System.out.println();
        str2[0] = "We";
        str2[2] = "create";
        str2[3] = "lots";
        for (String s : str2)
            StringArray.printString(s);

    }
}
