package bitwise_operators;

public class CipherByStringAdnXOR { // Cipher the original message using XOR and an String as encoder
    public static void main(String[] args) { // using XOR twice returns to the original
        String originalMsg = "This is a super-puper-secret message";
        String encodedMsg = "";
        String decodedMsg = "";
        String encoder = "Nebraska";

        int size = encoder.length();

        System.out.println("Original message: ");
        System.out.println(originalMsg);
        System.out.println("==================");

        int j = 0;
        for (int i = 0; i < originalMsg.length(); i++) {
            encodedMsg = encodedMsg + (char) (originalMsg.charAt(i) ^ encoder.charAt(j));
            j++;
            if (j == (encoder.length() - 1)) j = 0;
        }
        System.out.println("Encoded message: ");
        System.out.println(encodedMsg);
        System.out.println("==================");

        j = 0;
        for (int i = 0; i < encodedMsg.length(); i++) {
            decodedMsg = decodedMsg + (char) (encodedMsg.charAt(i) ^ encoder.charAt(j));
            j++;
            if (j == (encoder.length() - 1)) j = 0;
        }
        System.out.println("Decoded message: ");
        System.out.println(decodedMsg);
        System.out.println("==================");
    }
}
