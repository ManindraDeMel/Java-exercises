package comp1110.lab2;

public class Reverse {
    public static void main(String[] args) {
        int n = 30;
        while (n >= 10) { // a do while will check for n first before starting the while loop. However, in this case it wouldn't change the code (problem solved the same way)
            System.out.println(n);
            n--;
        }
    }
}
