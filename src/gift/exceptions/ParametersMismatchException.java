package gift.exceptions;

import java.lang.Exception;

/**
 * Created by ekaterinabut on 10/21/15.
 */
public class ParametersMismatchException extends Exception {
    public ParametersMismatchException() {
    }

    public ParametersMismatchException(String message) {
        super (message);
    }

    public ParametersMismatchException(Throwable cause) {
        super (cause);
    }

    public ParametersMismatchException(String message, Throwable cause) {
        super (message, cause);
    }
}