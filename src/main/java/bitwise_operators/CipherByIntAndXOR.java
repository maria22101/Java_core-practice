package bitwise_operators;

public class CipherByIntAndXOR { // Cipher the original message using XOR and an int as encoder
    public static void main(String[] args) { // using XOR twice returns to the original
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
