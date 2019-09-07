package collections.stack;

public class Stack01 {
    private char[] stk;
    private int topOfStack;

    Stack01(int size) {
        stk = new char[size];
        topOfStack = 0;
    }

    Stack01(Stack01 obj){
        topOfStack = obj.topOfStack;
        stk = new char[obj.stk.length];
        for (int i = 0; i < topOfStack; i++) {
            stk[i] = obj.stk[i];
        }
    }

    Stack01(char a[]){
        stk = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    void push(char ch){
        if (topOfStack == stk.length){
            System.out.println("Stack is full");
            return;
        }
        stk[topOfStack] = ch;
        topOfStack++;
    }

    char pop(){
        if (topOfStack == 0){
            System.out.println("Stack is empty");
            return (char) 0;
        }
        topOfStack--;
        return stk[topOfStack];
    }

    public static void main(String[] args) { // Demonstrating Stack01 class
        Stack01 s1 = new Stack01(8);
        Stack01 s2 = new Stack01(new char[]{'B', 'r', 'i', 'a', 'n'});

        for (int i = 0; i < 8; i++) {
            s1.push((char) ('A' + i));
        }

        Stack01 s3 = new Stack01(s1);

        char ch;
        System.out.print("Content of s1: ");
        for (int i = 0; i < 8 ; i++) {
            ch = s1.pop();
            System.out.print(ch);
        }
        System.out.println();

        System.out.print("Content of s2: ");
        for (int i = 0; i < s2.stk.length ; i++) {
            ch = s2.pop();
            System.out.print(ch);
        }
        System.out.println();

        System.out.print("Content of s3: ");
        for (int i = 0; i < s3.stk.length ; i++) {
            ch = s3.pop();
            System.out.print(ch);
        }
    }

}
