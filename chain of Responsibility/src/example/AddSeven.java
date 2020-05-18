package example;

public class AddSeven extends Handler{
    @Override
    public Integer addDigit(Integer number) {
        if(checkSum(number)){
            number = number + 7;
            numberList.add(7);
            return successor.addDigit(number);
        }
        return number;
    }
}
