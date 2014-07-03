package exceptions;

/**
 * Author: Daniel
 */
public class SampleClass {

    public void testException() throws SampleException {
        throw new SampleException("Wyrzucono wyjątek");
    }
}
