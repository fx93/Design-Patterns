package example;

public class Application {

    public static void main(String[] args) {

        Handler two=new AddTwo();
        Handler four=new AddFour();
        Handler seven=new AddSeven();

        two.setSuccessor(four);
        four.setSuccessor(seven);
        seven.setSuccessor(two);

        two.addDigit(1);

        System.out.println(Handler.numberList);
    }
}
