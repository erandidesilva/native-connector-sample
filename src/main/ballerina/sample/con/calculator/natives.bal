package sample.con.calculator;

public connector CalculatorConnector() {
    native action add(int value1, int value2)(int);
}