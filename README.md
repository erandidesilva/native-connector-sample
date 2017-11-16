# Ballerina Sample connector using native actions

This is a sample native client connector implementation for Ballerina.

1. Build this with `mvn clean install`
2. Copy the jar file to `<BALLERINA_HOME>/bre/lib` folder

Write a sample program to use the connector as follows in a file `nativeActionTest.bal`

```ballerina
import sample.con.calculator as cal;

function main(string[] args) {
    endpoint<cal:CalculatorConnector> ep {
        create cal:CalculatorConnector();
    }
    int resultAdd = ep.add(2,5);
    int resultDiv = ep.divide(4, 2);
    println(resultAdd);
    println(resultDiv);
}
```
and run the program using the command `ballerina run nativeActionTest.bal`
