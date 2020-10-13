package com.tw;

public class MultiplicationTable {

    public String generateMultiplicationTable(int num1, int num2) {
        String generatedResult = "";
        int product;

        boolean checkIfGreaterThanOrEqual = checkIfGreaterThanOrEqual(num1, num2);
        boolean checkIfWithinRange = checkIfWithinRange(num1, num2);

        if(!checkIfGreaterThanOrEqual || !checkIfWithinRange) {
            generatedResult = null;
        }

        if(generatedResult != null){
            for(int x = num1; x <= num2; x++){
                for(int y=x; y<=num2; y++) {
                    product = multiplyNumbers(num1, y);
                    if(num1 == num2){
                        generatedResult = generatedResult + num1 + "*" + num2 + "=" + product;
                        break;
                    }
                    for(int z=y; y<=x)
                    generatedResult +=  String.format(x + "*" + y + "=" + product + "%n");
                }
                generatedResult += ' ';
            }
        }
        return generatedResult;
    }

    private int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    private boolean checkIfWithinRange(int num1, int num2) {
        return num1 < num2 || num1 == num2;
    }

    private boolean checkIfGreaterThanOrEqual(int num1, int num2) {
        return num1 >= 1 && num2 <= 100;
    }

}

