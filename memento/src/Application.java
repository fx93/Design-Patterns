

public class Application {

    public static void main(String[] args) {

        CareTaker careTaker=new CareTaker();
        BrowseHistory browseHistory=new BrowseHistory();

        browseHistory.addEntry(new UrlEntry("Youtube"));
        browseHistory.addEntry(new UrlEntry("Google"));

        careTaker.save(browseHistory);
        System.out.println(browseHistory);


        browseHistory.addEntry(new UrlEntry("Reddit"));
        careTaker.save(browseHistory);
        System.out.println(browseHistory);


        browseHistory.addEntry(new UrlEntry("Facebook"));
        browseHistory.addEntry(new UrlEntry("Pinterest"));
        careTaker.save(browseHistory);
        System.out.println(browseHistory);

        careTaker.revert(browseHistory);
        System.out.println(browseHistory);

        careTaker.revert(browseHistory);
        System.out.println(browseHistory);

        careTaker.revert(browseHistory);
        System.out.println(browseHistory);

    }
}
