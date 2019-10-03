package streams;

public class FirstCapitalLetter {
    String getStringCapitalized(String s){
        return String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);
    }
}
