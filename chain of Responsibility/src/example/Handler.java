package example;

import java.util.ArrayList;
import java.util.List;

public abstract class Handler {

    protected Handler successor;
    protected static ArrayList<Integer> numberList;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract Integer addDigit(Integer number);

    public boolean checkSum(Integer number){
        Integer sum=0, remainder;
        while(number>0){
            remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }
        if(sum == 9){
            return false;
        }
        return true;
    }
}
