package example;

public class AddTwo extends Handler {
    @Override
    public Integer addDigit(Integer number) {
        if(checkSum(number)){
            number = number + 2;
            numberList.add(2);
            return successor.addDigit(number);
        }
        return number;
    }
}
