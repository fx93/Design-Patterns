import java.util.Stack;

//keeps track for the originator - browse history
public class CareTaker {

    Stack<BrowseHistory.HistoryMemento> versionStack=new Stack<>();

    public void save(BrowseHistory browseHistory){
        versionStack.push(browseHistory.save());
    }

    public void revert(BrowseHistory browseHistory){
        if(!versionStack.isEmpty()){
            browseHistory.revert(versionStack.pop());
        }
        else {
            System.out.println("Cannot Undo");
        }
    }
}
