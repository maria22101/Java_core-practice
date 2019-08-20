package bitwise_operators;

public class CipherWithXOR {
    public static void main(String[] args) { // using XOR twise returns to the original
        String originalMsg= "This is a secret message";
        String encodedMsg = "";
        String decodedMsg = "";
        int encoder = 24;

        for (int i = 0; i < originalMsg.length(); i++) {
            encodedMsg = encodedMsg + (char) (originalMsg.charAt(i) ^ encoder);
        }
        System.out.println("Encoded message: " + encodedMsg);

        for (int i = 0; i < encodedMsg.length(); i++) {
            decodedMsg = decodedMsg + (char) (encodedMsg.charAt(i) ^ encoder);
        }
        System.out.println("Decoded message: " + decodedMsg);
    }
}
