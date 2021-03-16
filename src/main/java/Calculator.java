public class Calculator {
    private int number1;
    private int number2;
    private double double1;
    private double double2;

    public Calculator(int number1, int number2, double double1, double double2) {
        this.number1 = number1;
        this.number2 = number2;
        this.double1 = double1;
        this.double2 = double2;
    }

    public int getAddition(){
        return number1 + number2;
    }

    public int getSubtraction(){
        return number1 - number2;
    }

    public int getMultiply(){
        return number1 * number2;
    }

    public double getDivide(){
        return double1 / double2;
    }
}
