package gift.exceptions;

import java.lang.RuntimeException;

/**
 * Exception raised in case if user enters command to console other than suggested choices.
 */

public class InputCommandException extends RuntimeException{

    public InputCommandException (String message) {
        super (message);
    }
}

