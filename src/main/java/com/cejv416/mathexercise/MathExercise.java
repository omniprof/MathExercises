package com.cejv416.mathexercise;

/**
 * Week 02 Math Exercise
 *
 * @author Ken Fogel
 */
public class MathExercise {

    public void convertCelciusToFahrenheit() {
        // Declarations / Input
        double celcius = 20.0;
        double fahrenheit;

        // Calculation Process
        fahrenheit = 9.0 / 5.0 * celcius + 32.0;

        // Output
        System.out.println(fahrenheit + " fahrenheit equals " + celcius + " celcius");
    }

    public void calculateTheAreaOfACircle() {
        
    }

    public void solveQuadraticEquation() {

    }

    public void calculateAreaOfATriangleWithoutARightAngle() {

    }

    /**
     * 'perform' is the method that manages the program. There is no rule or
     * convention for the name 'perform' so you could call it anything you 
     * want as long as its a verb.
     */
    public void perform() {
        convertCelciusToFahrenheit();
        calculateTheAreaOfACircle();
        solveQuadraticEquation();
        calculateAreaOfATriangleWithoutARightAngle();
    }

    /**
     * Where the program begins
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MathExercise().perform();
    }

}
