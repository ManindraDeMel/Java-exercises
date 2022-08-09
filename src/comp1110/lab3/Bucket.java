package comp1110.lab3;

public class Bucket {
    private final double capacity;
    private double contents;
    ///////////////////////////////
    Bucket(double capacity) {
        this.capacity = capacity;
    }
    ///////////////////////////////
    public double getCapacity() {
        return this.capacity;
    }
    public double getContents() {
        return this.contents;
    }
    public double empty() {
        double emptiedContents = this.contents;
        this.contents = 0;
        return emptiedContents;
    }
    public void add(double amount) {
        if (!(this.capacity < this.contents + amount)) {
            this.contents += amount;
        }
        else {
            this.contents += this.capacity - this.contents;
        }
    }
    public static void main(String[] args) {
        Bucket big = new Bucket(10.0);
        Bucket small = new Bucket(1.0);

        for (Bucket bucket : new Bucket[]{big, small}) { // Tasks 1 - 3
            bucket.add(20.0);
            System.out.println(bucket.getContents());
            bucket.empty();
        }
        // Empty the small bucket into the big bucket. Print out the contents of each of them and ensure that the small bucket is empty and the big bucket has 1.0 in it.
        small.add(1000.0);
        big.empty();
        big.add(small.getContents());
        small.empty();
    }
}