package strings;

public class StringArraySort {
    public static void main(String[] args) {

        String strArr[] = {"Evelyn", "Eva", "Emily", "Elisett", "Eleonora", "Ella", "El"};
        String strForSwitch;

        System.out.println("Original array:");
        for (String s : strArr) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        for (int i = 1; i < strArr.length; i++) { // this is Bubble Sort
            for (int j = strArr.length - 1; j >= i; j--) {
                if (strArr[j - 1].length() > strArr[j].length()) {
                    strForSwitch = strArr[j - 1];
                    strArr[j - 1] = strArr[j];
                    strArr[j] = strForSwitch;
                }
            }
        }

        System.out.println("Sorted array:");
        for (String s : strArr) {
            System.out.print(s + " ");
        }
    }
}
