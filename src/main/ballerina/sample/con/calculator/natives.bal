package sample.con.calculator;

public connector CalculatorConnector() {
    native action add(int value1, int value2)(int);
    action divide(int value1, int value2)(int){
        int result;
        if (value2 > 0){
             result = value1 / value2;
        }
        return result;
    }
}