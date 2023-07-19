package org.example;

public class ScoreChecker {
    public static void main(String[] args) {
        // Test the method with different values
        try {
            checkScore(2.15);
            checkScore(50);
            checkScore(95.02);
            checkScore(100.01);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkScore(double score) {
        if (score > 0 && score <= 50.00) {
            System.out.println("Average score");
        } else if (score > 50.00 && score <= 100.00) {
            System.out.println("Very good score");
        } else {
            throw new ArithmeticException("Score is out of scale!");
        }
    }
}
