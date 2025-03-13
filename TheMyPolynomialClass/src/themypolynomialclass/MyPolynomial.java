/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themypolynomialclass;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class MyPolynomial {
    
    private double[] coeffs;

    public MyPolynomial() {
    }

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    @Override
    public String toString() {
        return "MyPolynomial{" + "coeffs=" + coeffs + '}';
    }
    
    public int getDegree() {
        return -1;
    }
    
    public double evaluate(double x) {
        return -1.0;
    }
    
    public MyPolynomial add(MyPolynomial right) {
        return this;
    }
    
    public MyPolynomial multiply(MyPolynomial right) {
        return this;
    }
}
