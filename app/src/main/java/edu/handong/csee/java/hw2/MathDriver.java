package edu.handong.csee.java.hw2;

import edu.handong.csee.java.hw2.math.MathCalculator;

/**
 * The Main driver. imports MathCalculator.java
 */
public class MathDriver {
    /**
     * main function
     */
    public static void main(String[] args){
        MathDriver newdriver = new MathDriver();
        newdriver.run(args);
    }

    /**
     * execute script
     */ 
    private void run(String[] args) {
        MathCalculator calc = new MathCalculator();
        calc.setName(args[0]);

        switch(args[1]){

            case "Max" : 
                System.out.println("Driver Name: "+calc.getName() + ", Answer: " +
                                    calc.getMax(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;
            // TO DO: Fill the rest of cases below. Do not modify other parts of this file.

            case "Min" : 
                System.out.println("Driver Name: "+calc.getName() + ", Answer: " +
                                    calc.getMin(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;

            case "Abs" : 
                System.out.println("Driver Name: "+calc.getName() + ", Answer: " +
                                    calc.getAbs(Integer.parseInt(args[2])));
                break;

            case "Sum" : 
                System.out.println("Driver Name: "+calc.getName() + ", Answer: " +
                                    calc.getSum(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;
            
            case "Diff" : 
                System.out.println("Driver Name: "+calc.getName() + ", Answer: " +
                                    calc.getDiff(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;

            case "Product" : 
                System.out.println("Driver Name: "+calc.getName() + ", Answer: " +
                                    calc.getProduct(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;

            case "Quotient" : 
                System.out.println("Driver Name: "+calc.getName() + ", Answer: " +
                                    calc.getQuotient(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;

            case "Remainder" : 
                System.out.println("Driver Name: "+calc.getName() + ", Answer: " +
                                    calc.getRemainder(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;

            case "Power" : 
                System.out.println("Driver Name: "+calc.getName() + ", Answer: " +
                                    calc.getPower(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;
            
            case "Factorial" : 
                System.out.println("Driver Name: "+calc.getName() + ", Answer: " +
                                    calc.getFactorial(Integer.parseInt(args[2])));
                break;

            case "Gcd" : 
                System.out.println("Driver Name: "+calc.getName() + ", Answer: " +
                                    calc.getGcd(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;

            case "Lcm" : 
                System.out.println("Driver Name: "+calc.getName() + ", Answer: " +
                                    calc.getLcm(Integer.parseInt(args[2]),Integer.parseInt(args[3])));
                break;

            case "Square" : 
                System.out.println("Driver Name: "+calc.getName() + ", Answer: " +
                                    calc.getSquare(Integer.parseInt(args[2])));
                break;

            default :
                System.out.println("Invalid command");
        }
    }
}
