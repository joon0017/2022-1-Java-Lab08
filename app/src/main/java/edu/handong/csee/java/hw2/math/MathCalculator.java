package edu.handong.csee.java.hw2.math;

/**
* Package with various mathematical methods
*/
public class MathCalculator {
 
    private String name;

    /**
    * method to change instance "name" variable
    */
    public void setName(String nm){
        this.name = nm;
    }
    /**
    * method to retrieve instance's name variable
    */
    public String getName(){ 
        return this.name;
    }

    /**
     * get larger value
     */
    public int getMax(int a, int b){
        if (a>b) return a;
        else return b;
    }
    
    /**
     * get lesser value
     */
    public int getMin(int a, int b){
        if (a<b) return a;
        else return b;
    }
    
    /**
     * get absolute value
     */
    public int getAbs(int a){
        if (a>0) return a;
        else return a * (-1);
    }

    /**
     * return sum of two integers
     */
    public int getSum(int a, int b){
        return a + b;
    }

    /**
     * return difference of two integers
     */
    
    public int getDiff(int a, int b){
        return a - b;
    }

    /**
     * return product of two integers
     */
    public int getProduct(int a, int b){
        return a*b;
    }

    /**
     * return quotient of two integers
     */
    public int getQuotient(int a, int b){
        if(b != 0) return a/b;
        return 0;
    }

    /**
     * return remainder of two integers
     */
    public int getRemainder(int a, int b){
        if(b != 0) return a%b;
        return 0;
    }

    /**
     * return power of two integers
     */
    public int getPower(int a, int b){
        if(b==0) return 1;
        int temp = 1;
        for (int i = 0; i < b; i++) {
            temp *= a;
        }
        return temp;
    }

    /**
     * return factorial value of integer
     */
    public int getFactorial(int a){
        if (a<0) return 0;
        if (a == 0 || a == 1) return 1;
        return a * getFactorial(a-1);
    }

    /**
     * return greatest common denominator of two integers
     */
    public int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }

    /**
     * return least common multiplier of two integers
     */
    public int getLcm(int a, int b){
        int lcm = a / getGcd(a, b) * b;
        return lcm;
    }

    /**
     * return square of an integer
     */
    public int getSquare(int a){
        return a*a;
    }

}


