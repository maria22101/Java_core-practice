package bitwise_operators;

public class CipherByStringAdnXOR { // Cipher the original message using XOR and an String as encoder
    public static void main(String[] args) { // using XOR twice returns to the original
        String originalMsg = "This is a super-puper-secret message";
        String encodedMsg = "";
        String decodedMsg = "";
        String encoder = "New-Zealand";
        int encoderCharIndex = 0;

        System.out.println("Original message: " + originalMsg);

        for (int i = 0; i < originalMsg.length(); i++) {
            if (encoderCharIndex < encoder.length()) {
                encodedMsg = encodedMsg + (char) (originalMsg.charAt(i) ^ encoder.charAt(encoderCharIndex));
                encoderCharIndex++;
            }else {
                encoderCharIndex = 0;
                encodedMsg = encodedMsg + (char) (originalMsg.charAt(i) ^ encoder.charAt(encoderCharIndex));
            }
        }
        System.out.println("Encoded message: " + encodedMsg);

        encoderCharIndex = 0;
        for (int i = 0; i < encodedMsg.length(); i++) {
            if (encoderCharIndex < encoder.length()) {
                decodedMsg = decodedMsg + (char) (encodedMsg.charAt(i) ^ encoder.charAt(encoderCharIndex));
                encoderCharIndex++;
            }else {
                encoderCharIndex = 0;
                decodedMsg = decodedMsg + (char) (encodedMsg.charAt(i) ^ encoder.charAt(encoderCharIndex));
            }
        }
        System.out.println("Decoded message: " + decodedMsg);
    }
}
