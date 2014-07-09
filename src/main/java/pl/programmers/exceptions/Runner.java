package pl.programmers.exceptions;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();

        try {
            sampleClass.testException();
        } catch (SampleException e) {
            System.out.println(e.getMessage());
        }
    }
}
