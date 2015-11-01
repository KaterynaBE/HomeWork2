package gift.exceptions;

import java.lang.RuntimeException;

/**
 * Exception raised in case if minimal weight is bigger than maximal for findCandies function.
 */
public class ParametersMismatchException extends RuntimeException {

    public ParametersMismatchException(String message) {
        super (message);
    }
}