package TP;

public abstract class Question implements Comparable {
    protected String enoncé;
    protected float note;

    public int compareTo(Object o) {
        return enoncé.compareTo(((Question) o).enoncé);
    }

    public boolean equals(Object o) {
        return (this.enoncé.equals(((Question) o).enoncé));
    }

    public int hashCode() {
        return this.enoncé.hashCode();
    }

    public abstract float calculerScore();
}
