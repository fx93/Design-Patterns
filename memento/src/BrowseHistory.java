import java.util.ArrayList;

// originator maintains the state
public class BrowseHistory {

    //later we need clone method - list vs arraylist
    ArrayList<UrlEntry> urlEntries=new ArrayList<>();

    public void addEntry(UrlEntry url){
        urlEntries.add(url);
    }

    public ArrayList<UrlEntry> getUrlEntries() {
        return (ArrayList<UrlEntry>) urlEntries.clone();
    }

    public HistoryMemento save(){
        return new HistoryMemento(getUrlEntries());
    }

    public void revert(HistoryMemento historyMemento){
        urlEntries=historyMemento.getUrlEntries();

    }

    @Override
    public String toString() {
        return "BrowseHistory{" +
                "urlEntries=" + urlEntries +
                '}';
    }

    static class HistoryMemento{

        ArrayList<UrlEntry> urlEntries;

        public HistoryMemento(ArrayList<UrlEntry> urlEntries) {
            this.urlEntries = urlEntries;
        }

        private ArrayList<UrlEntry> getUrlEntries() {
            return urlEntries;
        }
    }
}
