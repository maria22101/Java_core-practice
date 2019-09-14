package algorithms;

public class RecursionFactorial {
    public  int do_calc_recursive(int i){
        if (i == 1) return 1;
        return i * do_calc_recursive(i - 1);
    }

    public int do_calc_loop(int num){
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        RecursionFactorial f = new RecursionFactorial();

        System.out.println(f.do_calc_recursive(4));
        System.out.println(f.do_calc_loop(4));
    }
}
