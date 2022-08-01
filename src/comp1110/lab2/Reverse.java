package comp1110.lab2;

public class Reverse {
    public static void main(String[] args) {
        int n = 30;
        while (n >= 10) { // a do while will run the codeblock first so before checking for n>=10 it will decrement n, therefore the condition will need to change to n>10 instead of n>=10
            System.out.println(n);
            n--;
        }
    }
}
