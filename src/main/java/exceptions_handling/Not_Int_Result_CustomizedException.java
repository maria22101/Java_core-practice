package exceptions_handling;

public class Not_Int_Result_CustomizedException extends Exception{
    int n;
    int d;

    public Not_Int_Result_CustomizedException(int n, int d) {
        this.n = n;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Result of " + n + " / " + d + " is non-integer";
    }
}
