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
            for(int x = num1; x <= num1; x++){

                for(int y=x; y<=num2; y++) {
                    product = multiplyNumbers(x, y);
                    if(num1 == num2){
                        generatedResult = generatedResult + num1 + "*" + num1 + "=" + product;
                        break;
                    }

                    if(y == num1){
                        generatedResult = generatedResult + num1 + "*" + num1 + "=" + product;
                        generatedResult += "\r\n";
                    }

                    if(y!=num1) {
                        generatedResult = generatedResult + x + "*" + y + "=" + product;

                    }

                    if(y>num1){
                        for(int z = num1+1; z <= y; z++){
                            product = multiplyNumbers(z, y);
                            generatedResult = generatedResult + "  " + z + "*" + y + "=" + product;

                            if(z==y){
                                if(z==num2){
                                    break;
                                }
                                generatedResult += "\r\n";
                            }

                        }
                    }

                }
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

