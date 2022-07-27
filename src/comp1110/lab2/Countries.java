package comp1110.lab2;

public class Countries {
    public static void main(String[] args) {
        String[] s = {"Germany", "Argentina", "Netherlands", "Brazil"};
        for (String country : s) {
            if (country != "Argentina") {
                System.out.println(country);
            }
        }
    }
}
