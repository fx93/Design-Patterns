
public abstract class SuperHeroes implements Cloneable {


    private String comics;

    public String getComics() {
        return comics;
    }

    public void setComics(String comics) {
        this.comics = comics;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
