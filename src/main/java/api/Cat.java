package api;

public class Cat implements Comparable<Cat> {

    private int cuteness;

    public Cat(int cuteness) {
        this.cuteness = cuteness;
    }

    public int compareTo(Cat o) {
        return Integer.compare(cuteness, o.cuteness);
    }
}
