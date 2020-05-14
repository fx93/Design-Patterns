

public class Batman extends SuperHeroes {
    private String villain;
    private int year;

    public String getVillain() {
        return villain;
    }

    public void setVillain(String villain) {
        this.villain = villain;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Batman{" +
                "villain='" + villain + '\'' +
                ", year=" + year +
                '}';
    }
}
