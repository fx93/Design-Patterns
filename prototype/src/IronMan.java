
public class IronMan extends SuperHeroes {
    private int year;
    private String actor;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "IronMan{" +
                "year=" + year +
                ", actor='" + actor + '\'' +
                '}';
    }
}
