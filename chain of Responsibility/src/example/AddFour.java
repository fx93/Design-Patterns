package example;

public class AddFour extends Handler {
    @Override
    public Integer addDigit(Integer number) {
        if(checkSum(number)){
            number = number + 4;
            numberList.add(4);
            return successor.addDigit(number);
        }
        return number;
    }
}
